package java9;

public class Primenoooo {
	
	
	public static void main(String[] args) {
		
		int limit=150;
		System.out.println("prime numbers are    "+limit);
		
for(int i=1;i<=150;i++)
{
	boolean prime = true;
	
for(int j=2;j<i;j++)
{
	if(i%j==0){
	 prime = false;
	break;
	
	
	}
	if(prime){
		System.out.println(+i);
		
	}
	
	
	
	
}
	
	
}
		
		
	}

}
