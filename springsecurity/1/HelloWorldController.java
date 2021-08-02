package com.springsecurity.demo.springSecurityExmaple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String demo() {
		return "Hello All...!";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User...!";
		
	}

	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin...!";
		
	}

}
