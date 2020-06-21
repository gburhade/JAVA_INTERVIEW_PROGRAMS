package StringManipulations;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) 
	{
		int temp,res=0,val;
		int rem=0,digits=0;
		System.out.println("Enter the number to check whether its an armstrong number or not");
		Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    
	    temp = num;
	    while(temp!=0)
	    {
	    	digits++;
	    	temp=temp/10;
	    }
	    
	   System.out.println(digits);
	    int orig = num;
		if(num>1)
		{
			
		   while(num!=0)
		  {
			rem = num%10;
			num = num/10;
			val = (int) Math.pow(rem,digits);
			res = res + val;
		   }
		   
		   if(res==orig)
			   System.out.println("Armstrong number");
		   else
			   System.out.println("not a Armstrong number");
		   
		}
		else
			System.out.println("Enter number greater than 1");
		
		
		
		

	}

      }

