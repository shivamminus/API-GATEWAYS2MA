package com.apiGateway.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

	/*
	 * Fallback method for Authorization Service
	 */
	@GetMapping("/authservicenotresponding")
	public String showCause() {
		return "Auth Service is taking too long to respond";
	}

	/*
	 * Fallback method for Component Service
	 */
	@GetMapping("/componentServiceNotResponding")
	public String showCause1() {
		return "Component Service is taking too long to respond";
	}

	/*
	 * Fallback method for Packaging Service
	 */
	@GetMapping("/PackagingServiceNotResponding")
	public String showCause2() {
		return "Packaging Service is taking too long to respond.. Please Try after sometime";
	}

	/*
	 * Fallback method for Payment Service
	 */
	@GetMapping("/PaymentServiceNotResponding")
	public String showCause3() {
		return "Booking Service is taking too long to respond.. Please Try after sometime";
	}

}
