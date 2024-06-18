package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	
	@GetMapping("/cities")
	public String getCities () {
		return "mumbai,pune,banglore,hyderabad";
	}

	@GetMapping("/contries")
	public String getContries () {
		return "India,Japan,China";

	}

	
}
