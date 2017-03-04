package com.avinash.calculator;

public class Addition extends BinaryOperation {

	private static Addition instance = new Addition('+', Operator.PLUS);

	private Addition(char symbol, Operator operator) {
		this.symbol = symbol;
		this.operator = operator;
	}
	
	
	public static Addition getInstance() {
		return instance;
	}

	@Override
	public double resultFor(double left, double right) {
		return left + right;
	}

}
