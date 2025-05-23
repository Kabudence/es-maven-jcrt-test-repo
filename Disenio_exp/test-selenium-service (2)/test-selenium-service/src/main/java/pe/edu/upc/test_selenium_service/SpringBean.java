package pe.edu.upc.test_selenium_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringBean {

    @Value("${jwtToken:oops}")
    private String jwtToken;

    @Value("${dbPassword:nopassword}")
    private String dbPassword;
    @Value("${pepe:pepe}")
    private String pepe;



    public String printProperties() {
        log.info("PRUEBA JOSUEJwt Token = " + jwtToken);
        log.info("PRUEBA JOSUE Db password = " + dbPassword);
        return dbPassword + jwtToken ;
    }
}
