///inheritance

class parent{



public void show(){
int x=1;
x=x*x;

System.out.println("x value is"+x);


}
}
class child extends parent{

int y=2;
public void show()
{
y=y+2;
super.show();

System.out.println(" y is "+y);
}

public static void main(String[] a){
child c=new child();


c.show();
}
}



