package StringManipulations;

import java.util.Scanner;

public class MultiplyTwoMatrix {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//FirstMatrix
		System.out.println("Enter the rows and columns for first matrix");
		int m = sc.nextInt(); //row
		int n = sc.nextInt(); //column
		
		int first[][] = new int[m][n];
	    System.out.println("Enter the element for first matrix");
	    for(int r1=0;r1<m;r1++)
	     {
		   for(int c1=0;c1<n;c1++)
		   {
			  first[r1][c1] = sc.nextInt(); 
		   }
	     }
	    
	    //SecondMatrix
	    System.out.println("Enter the rows and columns for second matrix");
		int p = sc.nextInt(); //row
		int q = sc.nextInt(); //column
		
		int second[][] = new int[p][q];
	    System.out.println("Enter the element for second matrix");
	    for(int r2=0;r2<p;r2++)
	    {
		   for(int c2=0;c2<q;c2++)
		   {
			  second[r2][c2] = sc.nextInt(); 
		   }
	    }
	   
	   
	    int sum=0;
	    int multiply[][] = new int[m][q];
	   
		if(n!=p)
			System.out.println("Matrices with the given order can't be multiplied with each other");
		else
		{
			for(int r1=0;r1<m;r1++)
			{
				for(int c2=0;c2<q;c2++)
				{
					for(int k=0;k<q;k++)
					{
						sum = sum + first[r1][k] * second[k][c2];
					}
					multiply[r1][c2] = sum;
					sum=0;
				}
			}
		}
		
		 System.out.println("Result of Matrix multiplication is : ");
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<q;j++)
			 {
	               System.out.print(multiply[i][j]+"\t");			 
			 }
			 System.out.println();
		 }
		
	}

}
