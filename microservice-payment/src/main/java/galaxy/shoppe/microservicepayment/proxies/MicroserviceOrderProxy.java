package galaxy.shoppe.microservicepayment.proxies;

import galaxy.shoppe.microservicepayment.models.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "microservice-order", url = "localhost:9002")
public interface MicroserviceOrderProxy {

    @GetMapping(value = "orders/{id}")
    Order getOrder(@PathVariable("id") long id);

    @PutMapping(value = "orders/update" )
    Order updateOrder(@RequestBody Order order);
}
