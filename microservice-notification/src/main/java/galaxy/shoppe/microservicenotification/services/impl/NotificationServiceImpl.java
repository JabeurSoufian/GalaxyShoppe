package galaxy.shoppe.microservicenotification.services.impl;

import galaxy.shoppe.microservicenotification.dao.entities.Order;
import galaxy.shoppe.microservicenotification.dao.repositories.OrderRepository;
import galaxy.shoppe.microservicenotification.services.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final OrderRepository orderRepository;

    public NotificationServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void receivePaidOrderId(String orderId) {
        Order order = this.orderRepository.getOrderById(Long.parseLong(orderId));
        order.setOrderNotified(true);
        this.orderRepository.save(order);
    }
}
