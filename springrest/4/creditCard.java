package com.example.demo.4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class creditCard {
	
	@Autowired
	validationInteface validationInteface;
	
	@RequestMapping("/check")
	public String  validateCard(@RequestParam("Name") String n,@RequestParam("cardNumber") String c) {
		return validationInteface.check(n,c) ;
		
	}

}
