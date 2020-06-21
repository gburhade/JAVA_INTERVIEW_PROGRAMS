package StringManipulations;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter number to check factorial for");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		else
			return (n * factorial(n-1));
			 			
	}

}
