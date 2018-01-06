/*package no.tusla.orderservice.contract;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"no.tusla:supplyservice:+:stubs:13187"}, workOffline = true)
public class SupplyserviceContractTest {

    TestRestTemplate restTemplate = new TestRestTemplate();


    @Test
    public void shouldReturnStock() throws Exception {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "http://127.0.0.1:13187/v1/checkNextSeasonForTire/Model X",
                String.class);

        assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));

        assertThat(responseEntity.getBody(), equalTo(
                "{\"price\":\"1000\"," +
                        "\"season\":\"summer\"," +
                        "\"model\":\"Model X\"," +
                        "\"tireModel\":\"stealth\"}"));
    }

}
*/