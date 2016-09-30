package java9;

import java.util.Scanner;

public class Numbers {
public static void main(String[] args) {
	

	int i=1;
	int count=0;
			while(i<=100)
			{
				System.out.println(" "+i);
		i++;
				count++;
			}
			System.out.println("-------------------------------");
			/*Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			//int n=Integer.parseInt(args[0]);
			// cannot pass the values here as we are executing in eclipse
			
			while(i>0){
				i=i%10;
				i--;
				count++;
				
				
			}*/
	System.out.println("count "+count);
}

}
