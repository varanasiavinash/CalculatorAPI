package com.avinash.calculator;

/**
 * 
 * @author avinash
 *This is an abstract class which has an abstract method for calculating the two operands values 
 *and this method is inherited by different classes and also it implements comparable interface 
 *to compare two operator priorities
 */
public abstract class BinaryOperation implements Comparable<BinaryOperation> {
	   
	char symbol;
	Operator operator;
	
	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public abstract double resultFor(double left, double right);
	
	@Override
	public int compareTo(BinaryOperation o) {

		if (this.operator.priority < o.operator.priority) {
			return -1;
		} else if (this.operator.priority > o.operator.priority) {
			return 1;
		}
		return 0; 

	}
}

 
