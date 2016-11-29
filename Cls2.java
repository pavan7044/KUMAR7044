public class Cls2 implements Itest{

	@Override
	public void show() {
		System.out.println("cls2");
		
	}
	public static void main(String[] args) {
		Itest it = new Cls1();
		it.show();
		it = new Cls2();
		it.show();
	}
	

}