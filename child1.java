//over ride

class parent{

public void show(int x){
 x=x*x;
System.out.println("parent " +x);
}
public void show1(int x,String str)
	{
	System.out.println(" parent  "+x+""  +str);
	}

}
class child extends parent{
public void show(int y){
y=y+5;
System.out.println(" y is "+y);
}
public void show1(int x,String str)
	{
	System.out.println(" parent  "+x+""  +str);
	}
public static void main(String a[]){
child s=new child();
s.show(100);
s.show1(10, "pavan");
}
}