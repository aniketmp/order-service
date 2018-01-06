package no.tusla.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableHystrix
@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

