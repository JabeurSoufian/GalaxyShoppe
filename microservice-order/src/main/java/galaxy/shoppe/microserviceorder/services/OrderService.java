package galaxy.shoppe.microserviceorder.services;

import galaxy.shoppe.microserviceorder.dao.models.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    public List<Order> getOrders();

    public Optional<Order> createOrder(Order order);
    public Optional<Order> getOrderById(Long id);
}
