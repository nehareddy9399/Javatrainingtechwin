package assignment1;

public class Methods {
	public void A() {
		System.out.println("Called A");
	}

	public void B() {
		int x = 5 * 9;
		System.out.println("Called B value is : " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods a = new Methods();
		a.A();
		a.B();
	}

}
