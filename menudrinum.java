import java.util.Scanner;
public class Menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("1.fabonacci series"+"2.palindrom"+"3.armstrong");
		do {System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:

		     int num,n1=0,n2=1,n3,i;
		  
		     System.out.println("enter num");
		     num=sc.nextInt();
		    
		     System.out.println(n1);
		     System.out.println(n2);
		      for(i=2;i<=num;i++) {
		      n3=n1+n2;
		 
		      System.out.println(n3);
		      n1=n2;
		      n2=n3;}
			break;
		case 2: 
			 int r,rev=0,temp;    
			  int n;//It is the number variable to be checked for palindrome  
			 System.out.println("enter num");
			   n=sc.nextInt();
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   rev=(rev*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==rev)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    

		

			break;
		case 3:
			int nu,tem,re=0,rem;
			System.out.println("enter num");
			nu=sc.nextInt();
			tem=nu;
			while(tem>0) {
				rem=tem%10;
				re=re+(rem*rem*rem);
				tem=tem/10;
			}
			if(re==nu)
				System.out.println("number is armstrong");
			else 
				System.out.println("number is not armstrong");

			break;
	
		
			
		default :
		  System.out.println("invalid entry");
		
		}

		

}while(choice<5);
	}
}
