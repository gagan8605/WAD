package com.java.collection;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ArrayListWithObject {

	public static void main(String[] args) {
		ArrayList<Object> a1 =new ArrayList<Object>();
		a1.add("Ram");
		a1.add(12);
		a1.add(true);
		a1.add('A');
		a1.add(45.12f);
		a1.add(70.15d);
		a1.add(8605171209l);
		a1.add(LocalDate.now());
		a1.add(LocalTime.now());
		System.out.println(a1);
       
	}

}
