package no.tusla.orderservice.service;
/*
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import no.tusla.orderservice.security.UserContext;
import no.tusla.orderservice.security.UserContextHolder;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
*/

public class ServiceCalls {
	/*
	@Autowired
	private DiscoveryClient discoveryClient;
    @Autowired
    RestTemplate restTemplate;
    
    private UserContext userContext;
    

	public void setUserContext(UserContext userContext) {
		this.userContext = userContext;
	}

	// Rest call to the stock service
    @HystrixCommand(fallbackMethod = "stockServiceUnavailable")
	public String callStockService(String model, String season,UserContext userCtx,String authToken){    
    	System.out.println("Calling stock service");
    	System.out.println(UserContext.AUTH_TOKEN+" via Setter:"+userContext.getAuthToken());
    	System.out.println(UserContext.AUTH_TOKEN+" via method call:"+userCtx.getAuthToken());
    	System.out.println(UserContext.AUTH_TOKEN+" via string method call:"+userCtx.getAuthToken());
		List<ServiceInstance> instances=discoveryClient.getInstances("stockservice");
	    ServiceInstance serviceInstance=instances.get(0);		
		String baseUrl=serviceInstance.getUri().toString();
		baseUrl=baseUrl+"/v1/stocks/"+model+"/"+season;
		System.out.println("stock service URL:"+baseUrl);			
		String json=null;
		try
		{
			 URI uri = UriComponentsBuilder.fromUriString(baseUrl)			           
			            .build()
			            .toUri();			 
			     
			   json = restTemplate.getForObject(uri, String.class);
			     
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		return json;
    }

    // Fallback method
    private String stockServiceUnavailable(String model, String season,UserContext utx,String authToken){
        return "{Error: \"Stockservice is Unavailable\"}";
    }

    // Rest call to the supply service
    @HystrixCommand(fallbackMethod = "supplyServiceUnavailable")
    public String callSupplyService(String model) {
    	
      
		List<ServiceInstance> instances=discoveryClient.getInstances("supplyservice");
	    ServiceInstance serviceInstance=instances.get(0);		
		String baseUrl=serviceInstance.getUri().toString();
		System.out.println("Order received for model:"+model);
		baseUrl=baseUrl+"/v1/supply/nextseason/"+model;
		System.out.println("Supply service URL:"+baseUrl);			
		String json=null;
		try
		{
			 URI uri = UriComponentsBuilder.fromUriString(baseUrl)			           
			            .build()
			            .toUri();			 
			     
			   json = restTemplate.getForObject(uri, String.class);
			     
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		return json;
    }
    // Fallback method
    private String supplyServiceUnavailable(String model){
        return "{Error: \"Supplyservice is Unavailable\"}";
    }

	*/
}
