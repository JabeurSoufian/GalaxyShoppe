package galaxy.shoppe.microservicepayment.services;

public interface NotificationService {
    void sendPaidOrderId(String orderId);
}
