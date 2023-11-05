package galaxy.shoppe.microserviceorder.dao.repository;

import galaxy.shoppe.microserviceorder.dao.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Long> {
    Optional<Order> findOrderById(Long id);

}
