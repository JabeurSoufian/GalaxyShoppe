package galaxy.shoppe.microserviceproduct.services.impl;

import galaxy.shoppe.microserviceproduct.configs.props.MicroserviceProductProperties;
import galaxy.shoppe.microserviceproduct.dao.entities.Product;
import galaxy.shoppe.microserviceproduct.dao.repositories.ProductRepository;
import galaxy.shoppe.microserviceproduct.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final MicroserviceProductProperties microserviceProductProperties;

    public ProductServiceImpl(ProductRepository productRepository, MicroserviceProductProperties microserviceProductProperties) {
        this.productRepository = productRepository;
        this.microserviceProductProperties = microserviceProductProperties;
    }

    @Override
    public List<Product> getAllProducts() {
        if (this.microserviceProductProperties.isSalePeriod()) {
            return this.productRepository.findAll().stream()
                    .sorted(Comparator.comparingInt(Product::getDiscountPercentage).reversed()).collect(Collectors.toList());
        }
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }
}
