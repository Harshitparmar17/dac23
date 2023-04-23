package com.payroll;

public class Manager extends Employee {
	private double perfbonus;
	
	public Manager(int empid, String name, String city, double basicsalary,double perfbonus) {
		super(empid,name,city,basicsalary);
		this.perfbonus=perfbonus;
	}
    public void showperfbonus() {
    	System.out.println("perfbonus="+perfbonus);
    	
    }
	@Override
	public String toString() {
		return super.toString()+"perfbonus="+this.perfbonus;
	}
	public double computenetsalary(){
		System.out.println("Manager salary");
		return this.perfbonus+super.basicsalary;
	}
}
