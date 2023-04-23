package com.app;

public class Employee {
	private int empid;
	private String name;
	private String city;
	private double salary;
	public Employee(int empid, String name, String city, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	public Employee() {
		
		this.empid = 100;
		this.name = "ram";
		this.city = "pune";
		this.salary = 40000;
	}

	public void display() {
		System.out.println( empid+"   "+name+"   "+city+"  "+salary);
	}
	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}
	}
