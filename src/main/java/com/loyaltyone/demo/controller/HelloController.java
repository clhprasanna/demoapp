package com.loyaltyone.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController  
{
	
	@GetMapping("/hello")
	public @ResponseBody String HelloWorld(@RequestParam String message)
	{
		
		return message;
	}

}
