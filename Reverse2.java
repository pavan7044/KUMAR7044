package java9;

import java.util.Scanner;

public class Reverse2 {
	
	
	/*public static void main(String[] args) {
		
		 int a, b = 0;
		 
		System.out.println("enter the revrese number");
		Scanner m= new Scanner(System.in);
		  a = m.nextInt();
		   
		  while ( a != 0)
		  {
			  b= b*10;
			  b= b+a%10;
			  a=a/10;
		  }
			  System.out.println("U r reverse number is "+b);
			  
		  }*/
		
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int a,b=0;
		System.out.println("enter a vaild number");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		while(a != 0)
		{
			b=b*10;
			b=b+a%10;
			a=a/10;
		}
		System.out.println("   "+b);
			
		}
		
		
	}
	
	
		
	


