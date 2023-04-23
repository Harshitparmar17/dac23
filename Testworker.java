package com.tester;
import com.payroll.Worker;
public class Testworker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Worker w=new Worker(105,"mansi","pune",40000,5,2500);
		System.out.println(w);
		System.out.println(w.computenetsalary());
}
}