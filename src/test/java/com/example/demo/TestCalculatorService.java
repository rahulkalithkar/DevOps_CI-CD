package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	CalculatorService calculatorService = new CalculatorService();
	
	@Test
	public void testSum() {
		Assertions.assertEquals(30, calculatorService.sum());
	}
	
	@Test
	public void testSumFail() {
		Assertions.assertNotEquals(40, calculatorService.sum());
	}
	
	@Test
	public void testMultiply() {
		Assertions.assertEquals(100, calculatorService.multiply());
	}
	
	@Test
	public void testMultiplyFail() {
		Assertions.assertNotEquals(30, calculatorService.multiply());
	}
	
	@Test
	public void testDivision() {
		Assertions.assertEquals(1, calculatorService.division());
	}
	
	@Test
	public void testDivisionFail() {
		Assertions.assertNotEquals(5, calculatorService.division());
	}
	
	@Test
	public void testSquareroot() {
		Assertions.assertEquals(1.7320507764816284, calculatorService.squareRoot());
	}
	
	@Test
	public void testSquarerootFail() {
		Assertions.assertNotEquals(1.8, calculatorService.squareRoot());
	}
	
	@Test
	public void testCuberoot() {
		Assertions.assertEquals(1.4422495365142822, calculatorService.cubeRoot());
	}
	
	@Test
	public void testCuberootFail() {
		Assertions.assertNotEquals(1.5, calculatorService.cubeRoot());
	}

}
