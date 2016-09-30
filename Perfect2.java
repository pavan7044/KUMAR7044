package java9;

import java.util.Scanner;

public class Perfect2 {
	
	
	public static void main(String[] args) {
		
		int n , i , sum=0;
		
		
		System.out.println("enter some value ");;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		for(i=0;i<n;i++){
			if ( n % i == 0 )
				System.out.println(i);
			System.out.println(n);
			{
				sum=sum+i;
			}
			System.out.println(sum);
			
			
		}
		if(sum==n){
			System.out.println("given number is perfect number");
			
		}
		else
		{
			System.out.println("given number not perfect number");
		}
		
		
	}
	

}
