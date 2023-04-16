package com.spring.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@GetMapping("/show")
	public void show()
	{
	System.out.println("welcome to spring boot app");	
	}
}
