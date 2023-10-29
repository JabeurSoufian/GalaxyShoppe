package galaxy.shoppe.microserviceproduct.services;

import galaxy.shoppe.microserviceproduct.dao.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> getAllProducts();
    public Optional<Product> getProductById(long id);
}
