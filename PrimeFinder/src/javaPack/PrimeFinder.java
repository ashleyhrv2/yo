package javaPack;

import java.util.Scanner;

public class PrimeFinder 
{
	public static int primesBetween(int lower, int upper) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lower number:");
		int lownum = input.nextInt();
		
		System.out.println("Enter upper number: ");
		int upnum = input.nextInt();
		System.out.print("Numbers chosen:" + lownum + upnum );
		
		int count = 0;
		for(int i = lower; i<= upper; i++)
		{
			if(itsprime(i))
			{
				count = count + 1;
			}
			
		}
		
		return count;

		
	}

	private static boolean itsprime(int i) {
		// TODO Auto-generated method stub
		return false;
	}
	
}	
