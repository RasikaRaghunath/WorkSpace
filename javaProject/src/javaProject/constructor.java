package javaProject;

public class constructor 
{
	 	   int a=7;
		   int b=17;
		   int d=19;
		   
	constructor(char y, int a)
	{
		int b=6;
		int f=50;
		System.out.println("Zero argument constructor");
	}
	
	constructor(int x)
	{
	int d=100;
	System.out.println(d);
	}
	
	constructor(char y)
	{
		System.out.println(y);
	}

public static void main(String args[])
{
	constructor n=new constructor('&',7);
	
	System.out.println(n.a);
	System.out.println(n.b);
	System.out.println(n.d);
	
	constructor i=new constructor(8);
	constructor g=new constructor('o');
}
}
