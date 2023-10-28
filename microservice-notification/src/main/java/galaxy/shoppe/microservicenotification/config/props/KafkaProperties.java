package galaxy.shoppe.microservicenotification.config.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.props.kafka")
public class KafkaProperties {

    private String bootstrapServers;
    private String groupId;

    private String paymentNotificationTopic;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getPaymentNotificationTopic() {
        return paymentNotificationTopic;
    }

    public void setPaymentNotificationTopic(String paymentNotificationTopic) {
        this.paymentNotificationTopic = paymentNotificationTopic;
    }
}
