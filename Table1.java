import java.util.Scanner;

public class Table1{
public static void main(String t[]){
int a,b;
System.out.println("enter a multiple number");
Scanner sc = new Scanner(System.in);
b=sc.nextInt();
for(a=1;a<=20;a++)
{
System.out.println(b+"*"+a+"="+(b*a));
}
}
}
