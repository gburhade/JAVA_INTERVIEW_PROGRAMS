package StringManipulations;

public class SplitExample {

	public static void main(String[] args) 
	{
		String s1 = "This is the world of Automation testing practice on java programming";
		String[] s2 = s1.split(" ");
		for(String s: s2)
		{
			System.out.println(s);
		}
		
		String s3 = s1.concat(". Today is 12-Jun-2020");
		System.out.println(s3);
		
	
		

	}

}
