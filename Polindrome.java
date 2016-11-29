import java.util.*;

class Polindrome{

public void Polin(){

int a,n,temp,c=0;

System.out.println("enter a number");
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
a=n%10;
c=(c*10)+a;
n=n/10;
}
if(temp==c)
{

System.out.println("It ia polindrome number");
}

else
{
System.out.println("it is not a polindrome number");
}
}
public static void main(String a[]){
Polindrome p = new Polindrome();
p.Polin();
}
}


