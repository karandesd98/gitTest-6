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
	
	@GetMapping("/welcome")
	public void welcome()
	{
	System.out.println("welcome to spring boot app whit git hub repository ");	
	}
	
	@GetMapping("/pratikService")
	public void pratikService()
	{
	System.out.println("welcome to software development pratik");	
	}
	
	
	@GetMapping("/pratikService2")
	public void pratikService1()
	{
	System.out.println("welcome to software development pratik");	
	}
	
	
}
