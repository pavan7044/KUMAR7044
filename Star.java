import java.util.*;

class Star{
public void star(){
	int a,i=0;
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();

for(int k=0;k<=a;k++){
	

for(i=0;i<=a;i++)
{

System.out.print(" ");
}
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();

}
}

public static void main(String []a){
Star S= new Star();
S.star();
}
}
