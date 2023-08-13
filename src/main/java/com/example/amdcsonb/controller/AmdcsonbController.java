package com.example.amdcsonb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class AmdcsonbController {
	
	@GetMapping
	public String greet() {
		return "Welcome Home!!";
	}

}
