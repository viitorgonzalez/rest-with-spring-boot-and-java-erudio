package br.com.vitor.math;

public class SimpleMath {
	
	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {

		return numberOne - numberTwo;
	}
	
	public Double multiplication(Double numberOne, Double numberTwo) {

		return numberOne * numberTwo;			
	}
	
	public Double division(Double numberOne, Double numberTwo) {
		
		return numberOne / numberTwo;
	}
	
	public Double mean (Double numberOne, Double numberTwo) {
	
		return sum(numberOne, numberTwo) / 2 ;  
	}
	
	public Double sqrtRoot(Double number) {
			
		return Math.sqrt(number);
	}
	
}