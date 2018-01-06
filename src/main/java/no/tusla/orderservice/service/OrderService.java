package no.tusla.orderservice.service;

import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import no.tusla.orderservice.security.UserContext;
import no.tusla.orderservice.security.UserContextHolder;



@Service
public class OrderService {
	@Autowired
	private DiscoveryClient discoveryClient;
    @Autowired
    RestTemplate restTemplate;
	public void check()
	{
		System.out.println("In check..."+UserContextHolder.getContext().getAuthToken());
	}
//	 @HystrixCommand(fallbackMethod = "stockServiceUnavailable")
		public String callStockService(String model, String season){    
	    	System.out.println("Calling stock service");
	    	System.out.println(UserContext.AUTH_TOKEN+":"+UserContextHolder.getContext().getAuthToken());
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
	    private String stockServiceUnavailable(String model, String season){
	        return "{Error: \"Stockservice is Unavailable\"}";
	    }

	    // Rest call to the supply service
//	    @HystrixCommand(fallbackMethod = "supplyServiceUnavailable")
	    public String callSupplyService(String model) 
	    {
	    	
	      
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

}
