package galaxy.shoppe.microservicepayment.services;

import galaxy.shoppe.microservicepayment.dao.entities.Payment;

public interface PaymentService {

    public Payment getPaymentByOrderId(long orderId);

    public Payment createPayment(Payment payment);
}
