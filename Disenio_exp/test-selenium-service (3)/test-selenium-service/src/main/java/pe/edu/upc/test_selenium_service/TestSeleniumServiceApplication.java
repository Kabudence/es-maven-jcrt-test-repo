package pe.edu.upc.test_selenium_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestSeleniumServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(TestSeleniumServiceApplication.class, args);

		SpringBean bean = context.getBean(SpringBean.class);
		bean.printProperties();
	}

}
