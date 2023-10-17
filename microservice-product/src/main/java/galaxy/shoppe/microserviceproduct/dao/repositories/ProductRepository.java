package galaxy.shoppe.microserviceproduct.dao.repositories;

import galaxy.shoppe.microserviceproduct.dao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
