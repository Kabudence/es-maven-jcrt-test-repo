package pe.edu.upc.test_selenium_service.qa.mock;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Slf4j
public class TestData {

    private String word;
    private String translation;

    public void setWord(String word) {
        this.word = word;
        log.info("Set word to translate: " + word);
    }

    public void setTranslation(String translation) {
        this.translation = translation;
        log.info("Translation received: " + translation);
    }
}
