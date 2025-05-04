package com.java.set;

public class StackUnderBoundsException extends Exception {
     String msg;

	public StackUnderBoundsException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "StackUnderBoundsException" + msg ;
	}
     
}
