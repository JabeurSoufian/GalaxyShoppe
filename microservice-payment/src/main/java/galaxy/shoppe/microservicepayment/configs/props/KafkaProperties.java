package galaxy.shoppe.microservicepayment.configs.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "app.props.kafka")
public class KafkaProperties {

    private String bootstrapServers;
    private String paymentNotificationTopic;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    public String getPaymentNotificationTopic() {
        return paymentNotificationTopic;
    }

    public void setPaymentNotificationTopic(String paymentNotificationTopic) {
        this.paymentNotificationTopic = paymentNotificationTopic;
    }
}
