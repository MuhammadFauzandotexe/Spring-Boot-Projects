package org.ojan.catalog.web;

import org.ojan.catalog.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	private GreetingService greetingService;
	public HelloResource(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
		
	@GetMapping("/")
	public String HelloWorld() {
		return greetingService.sayGreeting();
	}
}
