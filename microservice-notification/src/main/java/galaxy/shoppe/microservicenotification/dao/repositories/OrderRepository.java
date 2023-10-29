package galaxy.shoppe.microservicenotification.dao.repositories;

import galaxy.shoppe.microservicenotification.dao.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order getOrderById(Long id);
}
