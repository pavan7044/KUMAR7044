package java9;

import java.util.Scanner;

public class Amstrong3 {
	/////only for three numbers

	   public static void main(String[] args) {
	int a=0,b,c;
	int temp;

	System.out.println("Enter Amstrong number");
	
	Scanner sc= new Scanner(System.in);
	c= sc.nextInt();
	temp = c;
	 
	while(c>0)
	{
		
		b=c%10;
		System.out.println("\n b value is "+b);
		c=c/10;
		System.out.println("\n c value is "+c);
		a=a+(b*b*b*b);////if it will have for number we can increase b value
		System.out.println("\n a value is "+a);
		
	} 
	if(temp==a){
	System.out.println("given number is Amstrong "+a);
		
	}
	else{
		System.out.println("given number is not an amstrong number"+a);
	}

	   }
}

