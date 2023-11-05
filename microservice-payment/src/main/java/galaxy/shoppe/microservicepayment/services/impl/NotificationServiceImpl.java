package galaxy.shoppe.microservicepayment.services.impl;

import galaxy.shoppe.microservicepayment.configs.props.KafkaProperties;
import galaxy.shoppe.microservicepayment.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class NotificationServiceImpl implements NotificationService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaProperties kafkaProperties;
    public NotificationServiceImpl(KafkaTemplate<String, String> kafkaTemplate, KafkaProperties kafkaProperties) {
        this.kafkaTemplate = kafkaTemplate;
        this.kafkaProperties = kafkaProperties;
    }



    @Override
    public void sendPaidOrderId(String orderId) {
		
		System.err.println("StART Sending notification !!!!");
        this.kafkaTemplate.send(this.kafkaProperties.getPaymentNotificationTopic(), orderId);
		
		System.err.println("End of Sending notification !!!! Where id: "+ orderId);
    }
}
