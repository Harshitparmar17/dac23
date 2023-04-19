package com.code;

public class TesterStudent {

	public static void main(String[] args) {
		
		 
		
		Student std=new Student(10,"Ram",94.23);
		System.out.println(std);
	
	
        Student[] arr=new Student[5];
        arr[0]=new Student(11, "Shyam",92.3);
        arr[1]=new Student (12,"radhe", 91.23);
        arr[2]=new Student (13,"kishan",90.23);
        arr[3]=new Student (14,"Ram",90.23);
        arr[4]=new Student (15,"Ghanshyam",90.23);

        
        System.out.println("------------");
        
        
        
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
        
        System.out.println("--------------");
          
        for(Student s :arr)
		{
			System.out.println(s);
		}
		
        
	}       
	
 
}
