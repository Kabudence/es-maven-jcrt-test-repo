package pe.edu.upc.test_selenium_service.qa.steps;

import pe.edu.upc.test_selenium_service.SpringBean;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
public class CustomSteps {

    private String resultMessage;

    @Autowired
    private SpringBean springBean;

    @Given("there the bean is created")
    public void thereTheBeanIsCreated() {
        assertThat(springBean).isNotNull();
        log.info("The spring bean has been created");
    }

    @Then("I will receive the correct message")
    public void theMessageIsProduced() {
        resultMessage = springBean.printProperties();
        log.info("The message is produced");
    }

    @When("the message is produced")
    public void iWillReceiveTheCorrectMessage() {
        log.info("Verifying the result message...");
        assertThat(resultMessage).isEqualTo("chimp99");
    }
}
