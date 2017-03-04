package com.avinash.calculator;

public class Division extends BinaryOperation {

	private static Division instance = new Division('/', Operator.DIVIDE);

	private Division(char symbol, Operator operator) {
		this.symbol = symbol;
		this.operator = operator;
	}
	
	

	public static Division getInstance() {
		return instance;
	}

	@Override
	public double resultFor(double left, double right) {

		if (left != 0) {
			return right / left;
		} else {
			throw new NumberFormatException("Division by zero is not possible");
		}
	}


}
