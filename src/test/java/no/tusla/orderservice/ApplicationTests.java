/*package no.tusla.orderservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@TestPropertySource(
		locations = "classpath:application.properties")
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private MockMvc mockEndpoint;


	@Test
	public void getTryes()throws Exception {

		mockEndpoint.perform(get("rest/getTyres/model/winter").contentType(MediaType.APPLICATION_JSON));
	}


	@Test
	public void contextLoads() {




	}

}
*/