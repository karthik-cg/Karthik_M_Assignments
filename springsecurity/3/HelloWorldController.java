package com.Springsecurity.Jdbc.springsecurityJdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String demo() {
		return "Helloo All";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User";
		
	}

	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin";
		
	}

}
