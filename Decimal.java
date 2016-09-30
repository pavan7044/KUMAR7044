package java9;

import java.util.Scanner;

public class Decimal {
	 
    public void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            System.out.println(index);
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
        	System.out.println(i);
//            System.out.print(binary[i]);
        }
    }
     
    public static void main(String a[]){
        Decimal dtb = new Decimal();
        dtb.printBinaryFormat(10);
    }
}


	/* public String toBinary(int n) {
	       if (n == 0) {
	           return "0";
	       }
	       String binary = "";
	       while (n > 0) {
	           int rem = n % 2;
	           binary = rem + binary;
	           n = n / 2;
	       }
	       return binary;
	   }

	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a number: ");
	       int decimal = scanner.nextInt();
	       Decimal decimalToBinary = new Decimal();
	       String binary = decimalToBinary.toBinary(decimal);
	       System.out.println("The binary representation is " + binary);

	   }



}*/
