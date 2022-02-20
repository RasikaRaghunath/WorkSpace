package javaProject;

public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		// 0 1 1 2 3 5 8 13 21 34.......
		
		int x=0;
		int y=1;
		int fact=1;
		
		for(int i=0; i<10; i++)
		{
			 
			System.out.println(x+" "); 
			int z=x+y; 
			
			x=y; 
			//System.out.println("now x= "+x); 
			y=z; 
			//System.out.println("now y= "+y);
		}
		
	}

}
