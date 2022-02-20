package javaProject;

public class armfor 
{
	public static void main(String args[])
	{
		int num=155; 
		int arm=0;
		int rem;
		for(int n=num; n>0; n=n/10)
		{		
			rem=n%10;
			arm=arm+rem*rem*rem;
			System.out.println(arm);
			System.out.println("____________________________");
		}
	
		if(num==arm)
		{
			System.out.println("Number is an Armstrong");
		}
		else
		System.out.println("Number is not an Armstrong");
	}
}
