package javaProject;
import java.util.Scanner;
	
public class PalindromNumber 
{
public static void main(String args[])
{
	int reminder, palindrome=0;
	int n;
	System.out.print("Enter Any Number: ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int c=n;
	
	while(n>0)
	{
		reminder=n%10;
		palindrome=(palindrome*10)+reminder;
		n=n/10;
	}
	if(c==palindrome)
	{
		System.out.println("This is palindrome number");
	}
	else
		System.out.println("This is Not palindrome number");
} 
}
