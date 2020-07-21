package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/sum")
	public int sum() {
		return 10+20;
	}
	
	@GetMapping("/multiply")
	public int multiply() {
		return 10*10;
	}
	
	@GetMapping("/division")
	public float division() {
		return 10/10;
	}
	
	@GetMapping("/squareroot")
	public double squareRoot() {
		return (float) Math.sqrt(3);
	}
	
	@GetMapping("/cuberoot")
	public double cubeRoot() {
		return (float) Math. cbrt(3);
	}

}
