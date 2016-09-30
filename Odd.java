import java.util.Scanner;

class Odd{
public static void main(String args[]){
int a,b;
System.out.println("enter a number");
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
b=a%2;
if(b!=0){
System.out.println("it is a odd number");
}
else
System.out.println("it is not a odd number");
}
}