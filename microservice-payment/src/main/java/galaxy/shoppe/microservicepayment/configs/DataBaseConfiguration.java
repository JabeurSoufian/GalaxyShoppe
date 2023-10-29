package galaxy.shoppe.microservicepayment.configs;

import galaxy.shoppe.microservicepayment.configs.props.DataBaseProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@ComponentScan("galaxy.shoppe.microservicepayment.*")
@EnableJpaRepositories(basePackages = "galaxy.shoppe.microservicepayment.dao.*")
public class DataBaseConfiguration {


    @Bean
    public DataSource dataSource(DataBaseProperties dataBaseProperties) {
        return DataSourceBuilder.create()
                .url(dataBaseProperties.getUrl())
                .username(dataBaseProperties.getUsername())
                .password(dataBaseProperties.getPassword()).build();

    }
}