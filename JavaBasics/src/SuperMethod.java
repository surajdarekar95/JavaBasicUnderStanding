class ABCD
{
	public void show() 
	{
		System.out.println("This is from A");
	}
	
}

class BCD  extends ABCD{
	public void show()
	{
		//Super keyword call super class method
		super.show();
		System.out.println("This is from B");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		BCD obj = new BCD();
		obj.show();
	}

}
