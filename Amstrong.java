import java.util.*;

class Amstrong{

public void Ams(){

int a,n,c=0,temp;

System.out.println("enter a number");

Scanner sc = new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);

}
if(temp==c)
System.out.println("amstrong number"+c);
else
System.out.println("it is not a Amstrong number");
}

public static void main(String a[])
{
Amstrong A = new Amstrong();
A.Ams();
}
}





