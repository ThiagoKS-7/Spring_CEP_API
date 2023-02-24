package com.api.consulta_cep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(classes = {ServletWebServerFactoryAutoConfiguration.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {"spring.cloud.config.enabled=false"})
@ExtendWith(MockitoExtension.class)
public class ConsultaCepApplicationTests  extends SpringIntegrationTest {
    @Autowired
    protected TestRestTemplate testRestTemplate;

    @When("^the client calls /v1/consulta-endereco$")
    @Test
    public void executeCepConsultation() throws Throwable {
        executePost();
    }

    @Then("^assert that the client receives status code of 200$")
    @Test
    public void checkEndpointHealth() throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertTrue(currentStatusCode == HttpStatus.OK);
    }

    @And("^assert the client receives a server response for CEP {word}$")
    @Test
    public void checkResponseBody(String response) throws Throwable {
        assertTrue(latestResponse.getBody() == response);
    }
}
