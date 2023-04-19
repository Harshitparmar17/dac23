package com.code;

public class Student {
	
	private int Rollno ;
	private String name;
	private double percentage;

	
	public Student(int Rollno,String name,double percentage)
	{   super();
		this.Rollno=Rollno;
		this.name=name;
		this.percentage=percentage;
	}
	public String toString() {
		return Rollno+"   "+name+" "+percentage;
	}

}
