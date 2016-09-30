
package java9;

import java.util.Scanner;

public class Amstrong {

	
	 public boolean isArmstrongNumber(int number){
         
	        int s = number;
	        int noOfDigits = String.valueOf(number).length();
	        int sum = 0;
	        int div = 0;
	        while(s > 0)
	        {
	            div = s % 10;
	            int temp = 1;
	            for(int i=0;i<noOfDigits;i++){
	                temp *= div;
	            }
	            sum += temp;
	            s = s/10;
	        }
	        if(number == sum) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	     
	    public static void main(String a[]){
	        Amstrong man = new Amstrong();
	        int x;
	        
	        System.out.println("enter a number");
	        Scanner sc =new Scanner(System.in);
	        x=sc.nextInt();
	        
	        
	        
	        
	        
	        System.out.println("Is 371 Armstrong number? "+man.isArmstrongNumber(x));
	   /*     System.out.println("Is 523 Armstrong number? "+man.isArmstrongNumber());
	        System.out.println("Is 153 Armstrong number? "+man.isArmstrongNumber(153));*/
	    }
	
	
	
}
