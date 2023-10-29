package galaxy.shoppe.microservicenotification.listeners;

import galaxy.shoppe.microservicenotification.services.NotificationService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    private final NotificationService notificationService;

    public KafkaListeners(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @KafkaListener(topics = "payment-notification", groupId = "group-id-1")
    void listener(String orderId) {
        System.out.println("Received Message in group: " + orderId);
        this.notificationService.receivePaidOrderId(orderId);
    }
}
