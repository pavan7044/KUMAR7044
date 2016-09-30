import java.util.*;
import java.lang.math;



class Sample<T>
{
void add(T t1, T t2)
{
t1=t1+t2;
}
public static void main(String a[]){
Sample <Integer> s1= new Sample();
int x=20;
int y=30;
s1.add(x,y);
}
}
