package com.avinash.calculator;

public class Multiplication extends BinaryOperation {

	private static Multiplication instance = new Multiplication('*', Operator.MULTIPLY);

	private Multiplication(char symbol, Operator operator) {
		this.symbol = symbol;
		this.operator = operator;
	}

	
	
	public static Multiplication getInstance() {
		return instance;
	}

	@Override
	public double resultFor(double left, double right) {
		return left * right;
	}

}