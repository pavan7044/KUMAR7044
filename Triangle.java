import java.util.Scanner;


class Triangle{

public void Tri(){

int n,a,d,num=1;

Scanner sc= new Scanner(System.in);
System.out.println("enter no of rows");
n = sc.nextInt();

for(a=1;a<=n;a++)
{
for(d=1;d<=a;d++)
{
System.out.print(num+" ");
num++;

}
System.out.println();
}
}

public static void main(String a[]){
Triangle T= new Triangle();
T.Tri();
}
}