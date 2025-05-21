package pe.edu.upc.test_selenium_service.qa.config;

import pe.edu.upc.test_selenium_service.qa.mock.TestData;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {

    @Bean
    public TestData testData() {
        return new TestData();
    }
}
