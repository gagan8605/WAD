package com.java.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Raghav");
		hm.put(102, "Guru");
		hm.put(103, "Malhar");
		hm.put(104, "Varad");
		System.out.println(hm);// {101=Raghav, 102=Guru, 103=Malhar, 104=Varad}
		String st = hm.putIfAbsent(105, "Ramesh");
		System.out.println(st);// null
		System.out.println(hm);// {101=Raghav, 102=Guru, 103=Malhar, 104=Varad, 105=Ramesh}
		Set<Integer> s = hm.keySet();

		System.out.println(s);// [101, 102, 103, 104, 105]
		Collection<String> c = hm.values();
		System.out.println(c);// [Raghav, Guru, Malhar, Varad, Ramesh]

		System.out.println(c.contains("Ramesh"));// true
		hm.replace(105, "Ramesh", "Raju");

		System.out.println(hm);// {101=Raghav, 102=Guru, 103=Malhar, 104=Varad, 105=Raju}

	}

}
