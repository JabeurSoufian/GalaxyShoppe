package galaxy.shoppe.microserviceorder.dao.repository;

import galaxy.shoppe.microserviceorder.dao.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
