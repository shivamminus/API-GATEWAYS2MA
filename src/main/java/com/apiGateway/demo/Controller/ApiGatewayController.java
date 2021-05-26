package com.apiGateway.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

	@GetMapping("/authservicenotresponding")
	public String showCause() {
		return "Auth Service is taking too long to respond";
	}

	@GetMapping("/componentServiceNotResponding")
	public String showCause1() {
		return "Component Service is taking too long to respond";	
	}

	@GetMapping("/bookingServiceNotResponding")
	public String showCause2() {
		return "Booking Service is taking too long to respond.. Please Try after sometime";
	}

}
