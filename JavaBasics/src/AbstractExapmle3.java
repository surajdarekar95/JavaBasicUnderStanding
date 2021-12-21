abstract class vehicle {
	public abstract int getNumberOfWheels();
}

class bus extends vehicle {

	@Override
	public int getNumberOfWheels() {
		return 6;
	}

}

class Auto extends vehicle {
	public int getNumberOfWheels() {
		return 3;
	}

}

public class AbstractExapmle3 {

	public static void main(String[] args) {

		Auto A = new Auto();
		System.out.println("Auto have " + A.getNumberOfWheels() + " wheels");

		bus B = new bus();
		System.out.println("Bus have " + B.getNumberOfWheels() + " wheels");

	}

}
