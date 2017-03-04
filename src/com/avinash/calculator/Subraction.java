package com.avinash.calculator;

public class Subraction extends BinaryOperation {

	private static Subraction instance = new Subraction('-', Operator.MINUS);

	private Subraction(char symbol, Operator operator) {
		this.symbol = symbol;
		this.operator = operator;

	} 
	
	

	public static Subraction getInstance() {
		return instance;
	}

	@Override
	public double resultFor(double left, double right) {
		return right - left;
	}


}
