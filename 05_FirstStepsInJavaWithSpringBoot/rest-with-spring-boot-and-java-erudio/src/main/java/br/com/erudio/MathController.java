package br.com.erudio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(
		@PathVariable(value = "numberOne") String numberOne,
		@PathVariable(value = "numberTwo") String numberTwo		
		) throws Exception {

		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) { 
			throw new Exception();
		} 
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	private Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D; // can launch an exception too
		
		String number = strNumber.replaceAll(",", "."); //replace all ',' to '.'
		if(isNumeric(number)) return Double.parseDouble(number);
		
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if(strNumber == null) return false; // can launch an exception too
		
		String number = strNumber.replaceAll(",", "."); //replace all ',' to '.'
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); // regex to verify if the parameter is a numeric
	}
	
}
