package java9;

import java.util.Scanner;

public class Amstrong2 {
	public static void main(String[] args)  {  
	    int c=0,a,temp,n;  
	    //It is the number to check armstrong
    System.out.println("Enter any amstrong number");
	    Scanner sc= new Scanner (System.in);
	    n=sc.nextInt();
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
//	    System.out.println(a);
//	    System.out.println(n);
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number"+c);   
	    else  
	        System.out.println("Not armstrong number"+c);   
	   }

}
