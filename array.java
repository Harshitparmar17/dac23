import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,choice=0;
	System.out.println("1.accept array"+"2.display array"+"3.search element"+"4.reverse array"+"5.even odd display"+"6.sum of all array elements");
	
	System.out.println("enter size of array");
	int size=sc.nextInt();
	int[]arr=new int[size];
	do {System.out.println("enter your choice");
	       choice=sc.nextInt();
	       switch(choice) {
	
	       case 1:
		
		System.out.println("enter elements of array");
		for( i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		break;
	       case 2:
	    	   System.out.println("display elements");
		for(i=0;i<size;i++) {
		
       System.out.print(arr[i]+" ");
	}  break;
	       case 3:
	    	   
		System.out.println("enter element to search");
		  int ele=sc.nextInt();
       for(i=0;i<size;i++) {
    	   
    	   if(arr[i]==ele)
    	   
    	   break;
    	   
    	   
    	    }
       if(arr[i]==ele) {
    	   System.out.println("element found at index "+i);
       }
       else
       System.out.println("elemrnt not found");
       		
	       
	       break;
	       case 4:
	    System.out.println("reverse array is");
	    for(i=size-1;i>=0;i--) {
	        System.out.println(arr[i]);
	    }
	    break;
	       case 5:
	    	   System.out.println("even number");
	    	   for(i=0;i<size;i++) {
	    		   if(arr[i]%2==0) {
	    			   System.out.println(arr[i]);
	    		   }
	    	   }
	    	   System.out.println("odd numbers");
	    	   for(i=0;i<size;i++) {
	    		   if(arr[i]%2!=0) {
	    			   System.out.println(arr[i]);
	    		   }
	    	   }
	    	break;
	       case 6:
	    	   System.out.println("sum of all elements of array");
	    	   int sum=0;
	    	   for(i=0;i<size;i++) {
	    	   sum=sum+arr[i];
	    	   }
	    	   System.out.println(sum);
	    	   break;
	    	   
	    default:
	    	System.out.println("invalid choice");
	       }
	}while(choice!=0);
}
}
