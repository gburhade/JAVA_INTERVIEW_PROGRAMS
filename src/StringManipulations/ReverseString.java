package StringManipulations;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string to reverse it");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int len = str.length();
		char ar1[] = str.toCharArray();
				char ar2[] = new char[30];
		for(int i=len-1,j=0;i>=0;i--)
		{
			ar2[j] = ar1[i];
			j++;
		}
		String rev = new String(ar2);
		System.out.println("Reverse of string is "+rev);
		

	}

}
