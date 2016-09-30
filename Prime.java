package java9;

import java.util.Scanner;

public class Prime {
	
	
	public boolean isPrime(long  x)
	{
		boolean flag = true;
		
		for(int i=2;i<x;i++){
			
			System.out.println("loop exutes :" +i);
			if(x%i==0)
			{
				return false;
				
			}
			
		}
		return true ;
		
	}
	public static void main(String[] args) {
		int n;
		Prime m=new Prime();
		System.out.println("enter n value");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
	long starttime = System.currentTimeMillis();
		boolean b= m.isPrime(n);
		long endtime=System.currentTimeMillis();
		System.out.println("Total time is :"+(endtime-starttime));
		
		if(b ==true){
			System.out.println("it is a prime number");
		}

		else
		{
			System.out.println("it is not a prime number");
		}
	
	}

}
