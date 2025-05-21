// CucumberTestContextConfiguration.java
package pe.edu.upc.test_selenium_service.qa;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@CucumberContextConfiguration
@SpringBootTest(properties = {
        "eureka.client.enabled=false",
        "spring.cloud.discovery.enabled=false"
})
@Slf4j
public class CucumberTestContextConfiguration {

    @Before
    public void setupCucumberSpringContext() {
        log.info("Configurando contexto de Spring para Cucumber...");
    }
}
