package galaxy.shoppe.microserviceproduct.web.controlles;

import galaxy.shoppe.microserviceproduct.dao.entities.Product;
import galaxy.shoppe.microserviceproduct.services.ProductService;
import galaxy.shoppe.microserviceproduct.web.exceptions.ProductNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/products")
    public List<Product> getAllProducts() {
        List<Product> products = this.productService.getAllProducts();
        if (products.isEmpty()) throw new ProductNotFoundException("No products are available for sale");
        return products;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable long id) {
        Optional<Product> product = this.productService.getProductById(id);
        if (product.isPresent())
            throw new ProductNotFoundException("The product corresponding to id " + id + " does not exist");
        return product.get();
    }
}