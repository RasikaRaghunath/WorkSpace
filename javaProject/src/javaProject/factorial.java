package javaProject;

import java.util.Scanner;

public class factorial {
	//4! = 4*3*2*1
	//8! = 8*7*6*5*4*3*2*1
	public static void main(String[] args)
	{
		int n;
		System.out.print("Enter Any Number: ");
		Scanner SC = new Scanner(System.in);
		n=SC.nextInt();
	
		int fact=1;
	
		for(int i=1; i<=n; i++) 
			{
				fact =fact*i;
			}
		
		System.out.println("______________________\n");
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
