package com.apiGateway.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ApiGatewayApplication {
	private static Logger logger = LoggerFactory.getLogger(ApiGatewayApplication.class);

	public static void main(String[] args) {
//        System.setProperty("server.connection-timeout","120000");
		System.setProperty("http.connection.timeout","600000");
		logger.info("API GATEWAY APPLICATION STARTING");
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
