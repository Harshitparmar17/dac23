package com.tester;

//import com.payroll.Employee;
import com.app.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee emp=new Employee();
         System.out.println("info of"+" "+emp);
         
         Employee emp2=new Employee(103,"shirish","kolhpur",60000);
         System.out.println("info of"+" "+emp2);
         
         Employee emp3;
         emp3=emp;
         emp=null;
         System.out.println("emp3;"+emp3);
         System.out.println("emp:"+emp);
	}

}
