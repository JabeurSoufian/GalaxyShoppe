package galaxy.shoppe.microservicepayment.dao.repositories;

import galaxy.shoppe.microservicepayment.dao.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByOrderId(long orderId);
}
