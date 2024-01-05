package com.anudip.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello...Good Morning";
	}
	
	@GetMapping("/show")
	public String show() {
		return "I am learning Spring boot";
	}
}
