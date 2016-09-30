package java9;

import java.util.Scanner;

public class Prime3 {

	public static void main(String[] args) {
		int a,b,c=0;
		
		System.out.println("enter n value ");
		Scanner sc= new Scanner(System.in);
		
		
		a=sc.nextInt();
		
		for(b=0;b<=a;b++){
			if(b%a==0)
				c=c+1;
			
		}
		if(c==1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		
		
		
	}
	
	
}
