package galaxy.shoppe.microservicepayment.web.controllers;

import galaxy.shoppe.microservicepayment.dao.entities.Payment;
import galaxy.shoppe.microservicepayment.services.PaymentService;
import galaxy.shoppe.microservicepayment.web.exceptions.PaymentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping(value = "/payment")
    public ResponseEntity<Payment> payAnOrder(@RequestBody Payment paymentReceived) {
        Payment payment = this.paymentService.getPaymentByOrderId(paymentReceived.getOrderId());
        if (payment != null) throw new PaymentNotFoundException("");

        Payment newPayment = this.paymentService.createPayment(paymentReceived);

        if (newPayment == null)
            throw new PaymentNotFoundException("Error, payment could not be established, try again later");

        return new ResponseEntity<>(newPayment, HttpStatus.CREATED);
    }
}
