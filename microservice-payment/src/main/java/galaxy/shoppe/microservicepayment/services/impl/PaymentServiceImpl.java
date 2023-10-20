package galaxy.shoppe.microservicepayment.services.impl;

import galaxy.shoppe.microservicepayment.dao.entities.Payment;
import galaxy.shoppe.microservicepayment.dao.repositories.PaymentRepository;
import galaxy.shoppe.microservicepayment.services.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment getPaymentByOrderId(long orderId) {
        return this.paymentRepository.findByOrderId(orderId);
    }

    @Override
    public Payment createPayment(Payment payment) {
        return this.paymentRepository.save(payment);
    }
}
