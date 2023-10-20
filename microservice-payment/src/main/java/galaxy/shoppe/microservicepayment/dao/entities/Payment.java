package galaxy.shoppe.microservicepayment.dao.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private long orderId;
    private double amount;
    private String cardNumber;

    public Payment() {
    }

    public Payment(long id, long orderId, double amount, String cardNumber) {
        this.id = id;
        this.orderId = orderId;
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
