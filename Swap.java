import java.util.Scanner;

class Swap{
static int a,b;
static void S(){
Scanner sc= new Scanner(System.in);
System.out.println("enter A value");
a=sc.nextInt();
System.out.println("enter B value");
b=sc.nextInt();
System.out.println("before Swap");
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swap");
System.out.println("A value is "+a);
System.out.println("B value is "+b);
}
public static void main(String d[]){
	S();

}


}
