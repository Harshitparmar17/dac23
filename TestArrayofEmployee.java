package com.tester;

import java.util.Scanner;

import com.app.Employee;
public class TestArrayofEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr=new int[5];
		Employee[] arr;
		arr=new Employee[5]; 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);  //display null values default initially
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Empid,name,city,salary");
			Employee e=new Employee(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
			arr[i]=e;
			
			
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	} 

}
}
