package com.payroll;

public class Worker extends Employee {

	private int hoursWorked,hourlyRate;

	public Worker(int empid, String name,String city, double basicSalary, int hoursWorked, int hourlyRate) {
		super(empid, name,city, basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
}

	@Override
	public double computenetsalary() {
		// TODO Auto-generated method stub
		return super.basicsalary+this.hoursWorked+this.hourlyRate;
	}

	@Override
	public String toString() {
		return super.toString()+"hoursWorked"+hoursWorked+" "+hourlyRate;
	}

}