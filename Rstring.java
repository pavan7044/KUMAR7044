import java.util.Scanner;

class Rstring{
public static void main(String args[]){
String original;
String reverse="";
System.out.println("enter a string ");
Scanner sc= new Scanner(System.in);
original=sc.nextLine();
int length= original.length();

for(int i=length-1;i>=0;i--){
reverse= reverse+ original.charAt(i);
System.out.println("step by step reverse string "+reverse);
}
System.out.println("\n reverse string "+reverse);

}
}


