package com.spring.A2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Resource {
	@RequestMapping("/")
	public String demo() {
		return "Hello Everyone";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "Hello user";
		
	}

	
	@RequestMapping("/admin")
	public String admin() {
		return "Hello  admin";
		

}}
