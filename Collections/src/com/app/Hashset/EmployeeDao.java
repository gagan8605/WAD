package com.app.Hashset;

import java.util.LinkedList;
import java.util.List;

public class EmployeeDao {

	public List<Employee> getEmployees() {
		LinkedList<Employee>ll =new LinkedList<Employee>();
		ll.add(new Employee(1001,"gagan",78945.12f));
		ll.add(new Employee(1002,"raj",80000.12f));
		ll.add(new Employee(1003,"mangesh",78445.12f));
		ll.add(new Employee(1004,"angad",562345.12f));
		ll.add(new Employee(1005,"sumit",84245.12f));
		ll.add(new Employee(1006,"saurabh",68945.12f));
		ll.add(new Employee(1007,"sanket",80945.12f));
		ll.add(new Employee(1008,"ramesh",308945.12f));
		return ll;
		
	}

}
