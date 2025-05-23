package pe.edu.upc.test_selenium_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class SpringBean {

    @Value("${jwtToken:oops}")
    private String jwtToken;

    @Value("${dbPassword:nopassword}")
    private String dbPassword;

    public String printProperties(){
        log.info("Jwt Token = " + jwtToken);
        log.info("Db password = " + dbPassword);
        return dbPassword + jwtToken;
    }
}
