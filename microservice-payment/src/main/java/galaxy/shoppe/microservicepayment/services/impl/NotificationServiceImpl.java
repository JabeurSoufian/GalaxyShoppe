package galaxy.shoppe.microservicepayment.services.impl;

import galaxy.shoppe.microservicepayment.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String orderId) {
        this.kafkaTemplate.send("payment-notification", orderId);
    }
}
