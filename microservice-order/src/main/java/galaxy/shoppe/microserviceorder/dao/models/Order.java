package galaxy.shoppe.microserviceorder.dao.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer productId;

    private Date orderDate;

    private Integer quantity;

    private Boolean orderPaid;

    public Order() {
    }

    public Order(Long id, Integer productId, Date orderDate, Integer quantity, Boolean orderPaid) {
        this.id = id;
        this.productId = productId;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.orderPaid = orderPaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getOrderPaid() {
        return orderPaid;
    }

    public void setOrderPaid(Boolean orderPaid) {
        this.orderPaid = orderPaid;
    }
}
