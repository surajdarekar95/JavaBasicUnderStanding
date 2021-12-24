
//Method Overriding is also called as Run time Polymorphism, Dyanamic Polymorphism, Late binding


class parent 
{

	public void property() 
	{
		System.out.println("Gold||Land||Money");
	}

	public void marry() 
	{
		System.out.println("parent : Salman||Katrina");
	}

}

class child extends parent 
{

	public void marry() 
	{
		System.out.println("child : Vicky||Katrina");
	}
}

public class MethodOverrinding {

	public static void main(String[] args) {

		parent p = new parent();
		p.property();
		p.marry();
		
		child c = new child();
		c.marry();
		
		parent p1= new child();
		p1.marry();
	}

}
