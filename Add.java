import java.util.Scanner;


class Add{

public static void ADD(){

int a,b;
int sum=0;
System.out.println("enter a number");

Scanner sc= new Scanner(System.in);
b=sc.nextInt();


for(a=0;a<=b;a++)
{
sum=sum+a;
System.out.println(a+"+"+sum);
}
}
public static void main(String args[]){
ADD();

}
}

