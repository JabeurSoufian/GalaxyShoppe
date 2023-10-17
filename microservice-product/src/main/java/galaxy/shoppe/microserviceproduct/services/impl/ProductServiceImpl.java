package galaxy.shoppe.microserviceproduct.services.impl;

import galaxy.shoppe.microserviceproduct.dao.entities.Product;
import galaxy.shoppe.microserviceproduct.dao.repositories.ProductRepository;
import galaxy.shoppe.microserviceproduct.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(long id)  {
        return productRepository.findById(id);
    }
}
