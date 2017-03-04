 package com.avinash.calculator;

/**
 * 
 * @author avinash
 *This class is responsible for instantiating different classes 
 */
public class BinaryOperationFactory extends BinaryOperation{
	
	
	public static BinaryOperation getOperation(Character operation) {
		
		if (operation == null) {
			return null;
		}
		if (operation == '+') {
			return Addition.getInstance();

		} else if (operation == '-') {
			return Subraction.getInstance();

		} else if (operation == '*') {
			return Multiplication.getInstance();

		} else if (operation == '/') {
			return Division.getInstance();	 
		}

		return null;
	}

	@Override
	public double resultFor(double left, double right) {
		// TODO Auto-generated method stub
		return 0;
	}

}