package galaxy.shoppe.microserviceorder.dao.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long productId;

    private Date orderDate;

    private int quantity;

    private boolean orderPaid;

    private boolean orderNotified;

    public Order() {
    }

    public Order(long id, long productId, Date orderDate, int quantity, boolean orderPaid, boolean orderNotified) {
        this.id = id;
        this.productId = productId;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.orderPaid = orderPaid;
        this.orderNotified = orderNotified;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isOrderPaid() {
        return orderPaid;
    }

    public void setOrderPaid(boolean orderPaid) {
        this.orderPaid = orderPaid;
    }

    public boolean isOrderNotified() {
        return orderNotified;
    }

    public void setOrderNotified(boolean orderNotified) {
        this.orderNotified = orderNotified;
    }
}
