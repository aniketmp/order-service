package no.tusla.orderservice;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.web.client.RestTemplate;

import no.tusla.orderservice.security.UserContextInterceptor;



@Configuration
public class OrderServiceConfigurations 
{
//	Rest template for accessing supply service with authentication + JWT token
    @Primary
    @Bean
    public RestTemplate getCustomRestTemplate() 
    {
	    RestTemplate template = new RestTemplate();
	    List interceptors = template.getInterceptors();
	    if (interceptors == null) 
	    {
	    	template.setInterceptors(Collections.singletonList(new UserContextInterceptor()));
	    } 
	    else 
	    {
		    interceptors.add(new UserContextInterceptor());
		    template.setInterceptors(interceptors);
	    }
	    return template;
	}
    
   
  
    
}
