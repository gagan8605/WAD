package com.java.collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		a1.add(12);
		a1.add(50);
		a1.add(45);
		a1.add(8);
		a1.add(3);
		System.out.println(a1);
		a1.add(2,25);
		System.out.println("after inserting new element");
		System.out.println(a1);

		a1.remove(4);
		System.out.println("after Removing 4 index element");
		System.out.println(a1);
		
		a1.addFirst(0);
		a1.addLast(10);
		System.out.println("after Inserting at front and end");
		System.out.println(a1);
		
		
//		System.out.println("Search Number");
//		boolean S_a1 =a1.contains(25);
//		System.out.println(S_a1);
		
		ListIterator<Integer> li =a1.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		System.out.println("Backward direction.....");
		while(li.hasPrevious())
			System.out.println(li.previous());
		System.out.println(li.previous());
	}

}
