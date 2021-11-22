interface E {
	void a();

	void b();

	void c();

	void d();
}

class F implements E {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("I am method A...");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am method B...");

	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("I am method C...");

	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am method D...");

	}

}

public class AbtractionByInterface {

	public static void main(String[] args) {

		E ob = new F();
		ob.a();
		ob.b();
		ob.c();
		ob.d();

	}

}
