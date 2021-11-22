//Encapsulation is a process of binding data with methods.
//make sure variables should be private and methods should be public

class student {

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int rollno;
	private String name;

}

public class EncapsulationDemo {

	public static void main(String[] args) {

		student s1 = new student();
		s1.setRollno(2);
		s1.setName("suraj");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}

}
