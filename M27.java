import java.util.Scanner;

class M27{
	static int a,b,c=1,n,sum=0;
public static void m1(){
//int a,b;
System.out.println("enter a number");
Scanner sc= new Scanner(System.in);
b=sc.nextInt();
for(a=0;a<=b;a++)
{
System.out.println("WELCOME TO PAVAN");
}
}
public  void m2(){
//int a=0,b=0,c=1,n;
System.out.println("enter a first addtion number");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<=n;i++)
{
a=b;
b=c;
c=a+b;
System.out.println(c);

}
m1();
}
public  void m3(){
//int a,n;
//int sum=0;
System.out.println("enter a fibnallic number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(a=0;a<=n;a++)
{
sum=sum+a;
System.out.println(sum+"+"+a);
}
}
public static void main(String args[]){
	M27 m= new M27();
	
m.m1();
m.m2();
m.m3();
}
}






