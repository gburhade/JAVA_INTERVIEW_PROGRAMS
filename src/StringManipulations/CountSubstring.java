package StringManipulations;

import java.util.Scanner;

public class CountSubstring {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string to check for");
		Scanner sc = new Scanner(System.in);
    	String inptext = sc.nextLine();
		System.out.println("Enter the substring to be searched for");
		Scanner  s = new Scanner(System.in);
		String substr = s.next();
		// System.out.println(str.split("hun", -1));
	    int count = ( inptext.split(substr,-1).length )-1;
		 
		System.out.println("Total occurrences: " + count);
		System.exit(0);

	}

}
