package pe.edu.upc.test_selenium_service.qa.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.test_selenium_service.qa.mock.TestData;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ExternalApiSteps {

    @Autowired
    private TestData testData;

    @Given("I have the word to translate {string}")
    public void iHaveTheWordToTranslate(String word) {
        testData.setWord(word);
    }

    @When("I submit it to the translator")
    public void iSubmitItToTheTranslator() {
        // Simulamos que el servicio traduce \"hello\" a \"bonjour\"
        String translated = "bonjour";
        testData.setTranslation(translated);
    }

    @Then("I receive the translation {string}")
    public void iReceiveTheTranslation(String expectedTranslation) {
        assertThat(testData.getTranslation()).isEqualTo(expectedTranslation);
        log.info("Assertion passed for translation");
    }
}
