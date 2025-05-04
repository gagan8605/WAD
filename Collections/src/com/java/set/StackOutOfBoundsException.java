package com.java.set;

public class StackOutOfBoundsException extends RuntimeException {
        String msg;

		public StackOutOfBoundsException(String msg) {
			super(msg);
			this.msg = msg;
		}
}
