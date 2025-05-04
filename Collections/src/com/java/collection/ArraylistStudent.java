package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class ArraylistStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Student> s1=new  LinkedList<Student>();
		
		s1.add(new Student("Gagan",45,7894561230l,70.52f));
		
		s1.add(new Student("Ram",7,9294561230l,50.52f));
		s1.add(new Student("Raghav",23,9294561230l,90.99f));
		s1.add(new Student("Raghav",23,9294561230l,90.99f));
		s1.add(new Student("Kunal",12,8945661230l,80.52f));
		for(Student s:s1)
			if(s.getRollNo()==7) {
				System.out.println(s.getMobileNo());
		        s.setMobileNo(8605171206l);
				System.out.println(s.getMobileNo());
		
			}
		 
	
			for (int i = 0; i < s1.size(); i++) {
	            for (int j = i + 1; j < s1.size(); j++) {
	                if (s1.get(i).equals(s1.get(j))) {
	                    System.out.println(s1.get(i));
	                    break;
	                }	
	            }
	
}}}