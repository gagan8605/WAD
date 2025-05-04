package com.app.Hashset;

import java.util.Hashtable;
import java.util.List;

class Employee {
	private int empId;
	private String empName;
	private float empSal;

	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public List<EmployeeDao> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Departement {
	private int deptId;
	private String deptName;

	public Departement(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Departement [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}

public class HashTableDemo {

	public static void main(String[] args) {
		List<Employee> employee = new EmployeeDao().getEmployees();
		Hashtable<Departement, List<Employee>> ht = new Hashtable<Departement, List<Employee>>();
		ht.put(new Departement(111, "HR"), employee.subList(1, 2));
		ht.put(new Departement(112, "Development"), employee.subList(3, 4));
		ht.put(new Departement(113, "testing"), employee.subList(3, 6));
		System.out.println(ht);
		for (Departement i : ht.keySet()) {
			System.out.println(i.getDeptName());
			List<Employee> emps = ht.get(i);
			 for (Employee e : emps)
				System.out.println(e.getEmpName());
		
			 for (Employee e : emps)
				System.out.println(e.getEmpSal());
		}

	}

}
