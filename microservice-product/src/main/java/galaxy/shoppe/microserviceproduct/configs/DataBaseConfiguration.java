package galaxy.shoppe.microserviceproduct.configs;

import galaxy.shoppe.microserviceproduct.configs.props.DataBaseProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@ComponentScan("galaxy.shoppe.microserviceproduct.*")
@EnableJpaRepositories(basePackages = "galaxy.shoppe.microserviceproduct.dao.*")
public class DataBaseConfiguration {


    @Bean
    public DataSource dataSource(DataBaseProperties dataBaseProperties) {
        return DataSourceBuilder.create()
                .url(dataBaseProperties.getUrl())
                .username(dataBaseProperties.getUsername())
                .password(dataBaseProperties.getPassword()).build();

    }
}