package StringManipulations;

public class Difference {

	public static void main(String[] args) 
	{
	  System.out.println("Main method");
	  display();
	  Difference d = new Difference();
	  d.show();
	  new Difference(10);

	}
	
	public Difference()
	{
		System.out.println("constructor");
	}
	
	public Difference(int a)
	{
		System.out.println(a);
	}
	
	static void display()
	{
		System.out.println("static method");
	}
	
	void show()
	{
		System.out.println("instance method");
	}

}
