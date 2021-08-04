package com.springsecurity.demo.springSecurityExmaple.2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginViewController {
	
	@GetMapping("/login/**")
	public String loginMethod() {
		return "login";
	}

}
