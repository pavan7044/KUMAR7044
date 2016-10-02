import java.util.Scanner;

class Fact01{


public static void main(String args[]){
int a,n;
double sum=1;
System.out.println("enter a fibnallic number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(a=1;a<=n;a++)
{
sum=sum*a;
//System.out.println(sum+"*"+a);
}
System.out.println(sum);
}
}