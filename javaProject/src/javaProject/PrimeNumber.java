package javaProject;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String []args)
	{
		//Prime numbers : 1 3 5 7 11 13 17
		
		    
		System.out.println("Enter Number ");
		Scanner S=new Scanner(System.in);
		int num=S.nextInt();
		
		int count=0;
		for(int i=1; i<=num; i++)   
		{
			if(num%i==0) 
			{ 
				count++; 
			}		
		}
		if(count==2)  //prime divisible by 2 numbers i.e 1 and itself
		{
			System.out.print("number is  prime"); 
		}
		else
			System.out.print("number is not prime");
			
			
		
	}

}
