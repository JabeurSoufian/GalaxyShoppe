package galaxy.shoppe.microservicepayment.web.controllers;

import galaxy.shoppe.microservicepayment.dao.entities.Payment;
import galaxy.shoppe.microservicepayment.models.Order;
import galaxy.shoppe.microservicepayment.proxies.MicroserviceOrderProxy;
import galaxy.shoppe.microservicepayment.services.NotificationService;
import galaxy.shoppe.microservicepayment.services.PaymentService;
import galaxy.shoppe.microservicepayment.web.exceptions.PaymentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;
    private final MicroserviceOrderProxy microserviceOrderProxy;

    private final NotificationService notificationService;

    public PaymentController(PaymentService paymentService, MicroserviceOrderProxy microserviceOrderProxy, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.microserviceOrderProxy = microserviceOrderProxy;
        this.notificationService = notificationService;
    }

    @PostMapping(value = "/payment")
    public ResponseEntity<Payment> payAnOrder(@RequestBody Payment paymentReceived) {
        Payment payment = this.paymentService.getPaymentByOrderId(paymentReceived.getOrderId());
        if (payment != null) throw new PaymentException("This order is already paid");

        Payment newPayment = this.paymentService.createPayment(paymentReceived);

        if (newPayment == null) throw new PaymentException("Error, payment could not be established, try again later");


        Order order = this.microserviceOrderProxy.getOrder(newPayment.getOrderId());

        order.setOrderPaid(true);

        this.microserviceOrderProxy.updateOrder(order);

        this.notificationService.sendPaidOrderId(String.valueOf(order.getId()));

        return new ResponseEntity<>(newPayment, HttpStatus.CREATED);
    }
}
