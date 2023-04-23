package com.tester;

import com.app.Employee;
import com.payroll.Manager;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		System.out.println(emp);
		Manager mgr=new Manager(104,"abhishek","shirdi",45000,4500);
        System.out.println(mgr);
        System.out.println(mgr.computenetsalary());
	}

}
