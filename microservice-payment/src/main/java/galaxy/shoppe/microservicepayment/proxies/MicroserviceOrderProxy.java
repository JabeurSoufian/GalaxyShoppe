package galaxy.shoppe.microservicepayment.proxies;

import galaxy.shoppe.microservicepayment.models.Order;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@LoadBalancerClient(name = "microservice-order")
@FeignClient(name = "microservice-order")
public interface MicroserviceOrderProxy {

    @GetMapping(value = "orders/{id}")
    Order getOrder(@PathVariable("id") long id);

    @PutMapping(value = "orders/update" )
    Order updateOrder(@RequestBody Order order);
}
