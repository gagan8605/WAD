package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer ,String> hm=new HashMap<Integer , String>();
		hm.put(12, "Pune");
		hm.put(14, "PCMC");
		hm.put(15, "Nashik");
		hm.put(16, "Ahilyanagar");
		hm.put(17,"Shrirampur");
		hm.put(1, "Navi-Mumbai");
		hm.put(11,"satara");
		hm.put(24, "latur");
		System.out.println(hm);
		hm.putIfAbsent(42, "Baramati");
		System.out.println(hm);
		System.out.println(hm.containsKey(15));//true
		 System.out.println("------HashMap Keys---------------");
		Iterator<Integer>it =hm.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-----HashMap Values---------");
		for(String s:hm.values()) {
			System.out.println(s);
		}
	
	}
}
