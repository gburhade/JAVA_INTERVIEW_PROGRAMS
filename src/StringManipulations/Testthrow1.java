package StringManipulations;

public class Testthrow1 {

	public static void main(String[] args) 
	{
		validate(13);
		System.out.println();
	}   
	
	static void validate(int age)
	{
		if(age<18)
			throw new ArrayIndexOutOfBoundsException("not valid");
			else
			System.out.println("welcome to java world");
	}

}
