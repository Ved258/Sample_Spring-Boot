package com.tka;

 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/")
	public String getMessage() {
		System.out.println("I am in get meassge ");
		return "Hello Welcome to my AOP Project";
	
	}
	@GetMapping("/msg")
	
	public String getmsg1() {
		System.out.println("hii");
		return "Good Morning Student";
	}
}
