package galaxy.shoppe.microservicenotification.config;

import galaxy.shoppe.microservicenotification.config.props.DataBaseProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@ComponentScan("galaxy.shoppe.microservicenotification.*")
@EnableJpaRepositories(basePackages = "galaxy.shoppe.microservicenotification.dao.*")
public class DataBaseConfiguration {


    @Bean
    public DataSource dataSource(DataBaseProperties dataBaseProperties) {
        return DataSourceBuilder.create()
                .url(dataBaseProperties.getUrl())
                .username(dataBaseProperties.getUsername())
                .password(dataBaseProperties.getPassword()).build();

    }
}