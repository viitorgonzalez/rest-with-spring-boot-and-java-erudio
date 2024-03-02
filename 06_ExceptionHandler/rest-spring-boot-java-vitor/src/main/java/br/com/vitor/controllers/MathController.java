package br.com.vitor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitor.converters.NumberConverter;
import br.com.vitor.exceptions.UnsupportedMathOperationException;
import br.com.vitor.math.SimpleMath;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo		
		) throws Exception {

		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
			throw new UnsupportedMathOperationException("Please set a numeric number");
		
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo		
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
			throw new UnsupportedMathOperationException("Please set a numeric number");
		
		return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo
		) throws Exception{
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
			throw new UnsupportedMathOperationException("Please set a numeric number");
		
		return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/division/{numberOne}/{numberTwo}")
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
			throw new UnsupportedMathOperationException("Please set a numeric number");
		
		return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@GetMapping("/mean/{numberOne}/{numberTwo}")
	public Double mean(
			@PathVariable (value = "numberOne") String numberOne,
			@PathVariable (value = "numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) 
			throw new UnsupportedMathOperationException("Please set a numeric number");
		
		return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));  
	}
	
	@GetMapping("/sqrtRoot/{number}")
	public Double sqrtRoot(
			@PathVariable (value = "number") String number
			) throws Exception {
		
		if(!NumberConverter.isNumeric(number)) 
			throw new UnsupportedMathOperationException("Please set a numeric number");
		
		return math.sqrtRoot(NumberConverter.convertToDouble(number));
	}
	
}
