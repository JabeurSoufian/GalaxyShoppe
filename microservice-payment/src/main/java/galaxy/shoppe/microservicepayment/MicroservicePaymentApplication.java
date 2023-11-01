package galaxy.shoppe.microservicepayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("galaxy.shoppe")
public class MicroservicePaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicePaymentApplication.class, args);
	}

}