import java.util.Scanner;
class Table{

public static void main(String args[]){

int a,b,c;
Scanner sc= new Scanner(System.in);
System.out.println("enter which table u want ");

a=sc.nextInt();
System.out.println("enter how many tables u want ");
c=sc.nextInt();

for(b=0;b<=c;b++){
System.out.println(a+"*"+b+"="+(a*b));
}
}
}
