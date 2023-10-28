package galaxy.shoppe.microservicenotification.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "payment-notification", groupId = "group-id-1")
    void listener(String data) {
        System.out.println("Received Message in group: " + data);
    }
}
