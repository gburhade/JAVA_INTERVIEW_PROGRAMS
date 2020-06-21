package StringManipulations;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns for matrix");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		System.out.println("Enter the first element of matrix");
		for(int r=0;r<m;r++)
		{
			for(int c=0;c<n;c++)
			{
				first[r][c] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the second element of matrix");
		for(int r=0;r<m;r++)
		{
			for(int c=0;c<n;c++)
			{
				second[r][c] = sc.nextInt();
			}
		}
		
		
	 for(int r=0;r<m;r++)
	 {
		 for(int c=0;c<n;c++)
		 {
			 sum[r][c] = first[r][c] + second[r][c] ;
		 }
	 }
	 
	 System.out.println("The Sum of matrix is : ");
	 for(int r=0;r<m;r++)
	 {
		 for(int c=0;c<n;c++)
		 {
			 System.out.print(sum[r][c]+"\t");
		 }
		 System.out.println();
	 }
		
		
		

	}

}
