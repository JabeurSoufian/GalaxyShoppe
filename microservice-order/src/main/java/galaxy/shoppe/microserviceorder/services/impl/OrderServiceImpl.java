package galaxy.shoppe.microserviceorder.services.impl;

import galaxy.shoppe.microserviceorder.dao.models.Order;
import galaxy.shoppe.microserviceorder.dao.repository.OrderRepository;
import galaxy.shoppe.microserviceorder.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Optional<Order> createOrder(Order order) {
       return Optional.of(this.orderRepository.save(order));
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return this.orderRepository.findById(id);
    }
}
