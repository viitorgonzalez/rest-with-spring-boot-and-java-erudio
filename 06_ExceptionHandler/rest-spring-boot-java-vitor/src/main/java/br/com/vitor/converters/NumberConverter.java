package br.com.vitor.converters;

public class NumberConverter {
	
	public static Double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D; // can launch an exception too
		
		String number = strNumber.replaceAll(",", "."); //replace all ',' to '.'
		if(isNumeric(number)) return Double.parseDouble(number);
		
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false; // can launch an exception too
		
		String number = strNumber.replaceAll(",", "."); //replace all ',' to '.'
		
		return number.matches("[-+]?[0-9]*\\.?[0-9]+"); // regex to verify if the parameter is a numeric
	}
	
}
