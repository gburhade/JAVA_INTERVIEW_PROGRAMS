package StringManipulations;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number to check if its a prime number or not");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		boolean flag = false;
		
		if(no<=1)
		{
			System.out.println("Entered number should be greater than 1");
		}
		else
		{
			
			for(int i=2;i<=no/2;i++)
			{
				if(no%i==0)
				{
					flag=true;
					break;
				}
			
			}
			
			if(flag==true)
				System.out.println(no+" not a prime number");
			else
				System.out.println(no+" is a prime number");
		}
		
				
		

	}

}
