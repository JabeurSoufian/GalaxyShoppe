package galaxy.shoppe.microserviceproduct.configs.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "app.props.product")
public class MicroserviceProductProperties {

    private boolean salePeriod;

    public boolean isSalePeriod() {
        return salePeriod;
    }

    public void setSalePeriod(boolean salePeriod) {
        this.salePeriod = salePeriod;
    }
}
