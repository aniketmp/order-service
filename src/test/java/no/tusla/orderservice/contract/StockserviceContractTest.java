/*package no.tusla.orderservice.contract;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"no.tusla:stockservice:+:stubs:13186"}, workOffline = true)
public class StockserviceContractTest {

    //@Autowired
    //private ServiceCalls service;

    TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void shouldSuccessfullyApplyForLoan() {
        // given:
        String model = "Model X";
        String season = "summer";

        // when:
        //String result = service.callStockService(model, season);

        // then:
        //assertThat(!result.isEmpty());
    }

    @Test
    public void validateStocksForAll() throws Exception {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "http://127.0.0.1:13186//v1/stocks/all", String.class);
        assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
        assertThat(responseEntity.getBody(), equalTo( "{\"price\":\"1000\",\"season\":\"summer\",\"model\":\"Model X\",\"tireModel\":\"stealth\"}"));
    }

}*/