abstract class bike {
	abstract void run();
}

class honda extends bike {

	public void run() {
		System.out.println("Bike is Running");
	}

}

class AbstractExample2 {
	public static void main(String[] args) {

		honda h = new honda();
		h.run();
	}
}