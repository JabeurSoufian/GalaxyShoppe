package galaxy.shoppe.microserviceorder.web.controllers;

import galaxy.shoppe.microserviceorder.dao.models.Order;
import galaxy.shoppe.microserviceorder.services.OrderService;
import galaxy.shoppe.microserviceorder.web.exceptions.OrderNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "/orders")
    public List<Order> getAllProducts() {
        List<Order> products = orderService.getOrders();
        if (products.isEmpty()) throw new OrderNotFoundException("No orders are available");
        return products;
    }

    @GetMapping(value = "/orders/{id}")
    public Order getOrderById(@PathVariable long id) {

        Optional<Order> order = orderService.getOrderById(id);

        if (order.isEmpty())
            throw new OrderNotFoundException("The product corresponding to id " + id + " does not exist");

        return order.get();
    }

    @PostMapping(value = "orders/add")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {

        Optional<Order> newOrder = this.orderService.createOrder(order);

        if (newOrder.isEmpty()) throw new OrderNotFoundException("Unable to add this order");

        return new ResponseEntity<Order>(order, HttpStatus.CREATED);
    }

    @PutMapping(value = "orders/update")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order) {

        Optional<Order> newOrder = this.orderService.updateOrder(order);

        if (newOrder.isEmpty()) throw new OrderNotFoundException("Unable to update this order");

        return new ResponseEntity<Order>(order, HttpStatus.CREATED);
    }
}
