import java.util.*;



class Reverse{

public void a(){

int x,y,z=0,temp;
System.out.println("enter a number");
Scanner sc = new Scanner(System.in);

x=sc.nextInt();
temp=x;
while(x>0)
{
y=x%10;
z=(z*10)+y;
x=x/10;
}k
if(temp==z)
System.out.println("it is reverse number"+z);
else
System.out.println("not a reverse number"+z);
}

public static void main(String a[])
{
Reverse r= new Reverse();
r.a();
}
}
