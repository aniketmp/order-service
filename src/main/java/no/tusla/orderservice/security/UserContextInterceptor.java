package no.tusla.orderservice.security;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class UserContextInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(
            HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
            throws IOException {
    	System.out.println("Inside the intercepptor");
    	
        HttpHeaders headers = request.getHeaders();
        headers.add(UserContext.CORRELATION_ID, UserContextHolder.getContext().getCorrelationId());
        headers.add(UserContext.AUTH_TOKEN, UserContextHolder.getContext().getAuthToken());
        
        System.out.println("Adding headers....");
//        System.out.println(UserContext.CORRELATION_ID+":"+UserContextHolder.getContext().getCorrelationId());
//        System.out.println(UserContext.AUTH_TOKEN+":"+UserContextHolder.getContext().getAuthToken());
        System.out.println("Request Header contains ?"+ request.getHeaders());
        System.out.println("The Uri is "+request.getURI());
        
        // Calling stock service with Authentication
        return execution.execute(request, body);
    }
}