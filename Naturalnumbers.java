package java9;

import java.util.Scanner;

public class Naturalnumbers {
	
	
	
	/////natural numbers///////
	
	/* public static void main(String[] args) {
	        // TODO Auto-generated method stub
	         
	        int count;
	         
	        for(count = 0; count <= 99;count++)
	                                 
	        System.out.print( count+",");
	        System.out.print(100);
	// can i do this without printing the 100 extra???  <----- this is the question i am needing, can this be done with the first print statement?
	    }
*/	
	
	
	
	///////natural numbers//////
/*	
	public static void main(String[] args) {
		int i,n ;
		System.out.println("enter a natural number");
		
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		
		
	
	
	for(i=0;i<=n;i++)
	{
		System.out.println(i);
	}

	
	
	}
	*/
	
	
	////// even numbers  ///////////
	/*public static void main(String[] args) {
		int i,n;
		System.out.println("pls enter a natural number");
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		
	
	
	for(i=0;i<=n;i++)
		
	{
		if(i%2==0){
			
		
		System.out.println(i);
		}
		
		
	}
	
	*/
	
	////////odd numbers //////
	/*public static void main(String[] args) {
	int i,n;
	
	
	
	System.out.println("pls enter a natural number");
	
	
	Scanner sc= new Scanner(System.in);
	n = sc.nextInt();
	
for(i=0;i<=n;i++)
	
{
	if(i%2 !=0){
		
	
	System.out.println(i);
	}
	
	
}*/
	
	/*public static void main(String org[])
	{
	int i;
	for(i=1;i<=100;i++){//loop for take 1 to 100 numbers
	if(i%2!=0)//condition to find odd numbers between 1 to 100
	{
	System.out.println(i);// print odd values between 1 to 100
	}
	}
	}*/
	
	
	public static void main(String org[]){
		
	  int i,k,j;
      for(i=1;i<100;i++)
      {
          k=0;
          for(j=2;j<i;j++)
          {
              if(i%j==0)
              {
                  k=1;
                  break;
              }
          }
          if(k==0)
          {
              System.out.println(i);
          }
      }
  }

/*More Programs: http://javamylanguage.blogspot.com/2011/12/java-program-to-print-all-numbers.html#ixzz4Kl4iTZX8
*/	
	
	
	
	
	
	
}

	
	
	
	
	
		
	
	
	


	
	
	
	

