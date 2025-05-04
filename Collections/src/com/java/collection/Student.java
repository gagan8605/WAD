package com.java.collection;
//POJO Class
public class Student {
	private  String name="gagan";
	private int RollNo=45;
	private long MobileNo=7894561230l;
	private float Marks=70.52f;
	
	
	public Student(String name, int rollNo, long mobileNo, float marks) {
		super();
		this.name = name;
		RollNo = rollNo;
		MobileNo = mobileNo;
		Marks = marks;
	}
	
	public Student() {
		super();
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public float getMarks() {
		return Marks;
	}
	public void setMarks(float marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", RollNo=" + RollNo + ", MobileNo=" + MobileNo + ", Marks=" + Marks + "]";
	}
	

}
