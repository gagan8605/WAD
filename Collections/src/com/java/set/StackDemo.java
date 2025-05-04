package com.java.set;

import java.util.Stack;

class MyStack {
	int arr[];
	int top;
	int capacity;

	public MyStack(int capacity) {
		super();
		this.capacity = capacity;
		arr = new int[capacity];
		top = -1; // default value of stack top
	}

	public void push(int x) throws StackOutOfBoundsException {
		if (isfull()) {
			throw new StackOutOfBoundsException("Stack is Full");
//			System.exit(x);
		}
		arr[++top] = x;
	}

	public int pop() throws StackUnderBoundsException {
		if (isEmpty()) {
			throw new StackUnderBoundsException(" Stack is Empty");
			
		}
		return arr[top--];
	}

	public int getSize() {
		return top += 1;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	private boolean isfull() {
		// TODO Auto-generated method stub
		return top == capacity - 1;
	}
	public void Search(int x) {
		
		
		boolean found=false;
		for(int i=0;i<capacity;i++) {
			if(x==arr[i]) {
				found=true;
			}
			else {
				found=false;
			}
		}
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i] + " ,");
		}
	}

}

public class StackDemo {

	public static void main(String[] args) throws StackUnderBoundsException {
//		Stack<Integer> s = new Stack<Integer>();
		MyStack s = new MyStack(3);
//		s.push(12);
//		s.push(11);
//		s.push(10);
//		s.push(45);
//		s.push(60);
//		s.push(85);
		s.printStack();
		System.out.println("After A pop\n");
		s.pop();
		s.printStack();
		int size = s.getSize();
		System.out.println(size);
		s.Search(45);
		
//		System.out.println(s);
//		s.pop();
//		System.out.println(s);
//		System.out.println(s.search(10)); // found(1) or No found(-1) 

	}

}
