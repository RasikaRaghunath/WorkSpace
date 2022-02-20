package javaProject;

public class variables
{
	static int b=10;  //global -static
			int c=5; //global -nonstatic
			
			void demo()  //non-static method(userdefined method)
			{
				int d=10;  // local
				System.out.println(b);
				System.out.println(c);
			}
			static void test() //static method(userdefined method)
			{
				int y=25;
				System.out.println(y);
			}
	public static void main (String[] args)//main method(system defined)
	//public-Access specifier;
		//Static- without class object we can deal with the main method
		//void-main method should not return any value
		//main-method
		//String[] args -array of string datatype 
	{
		System.out.println(b);
		
		variables x= new variables();
		System.out.println(x.c);
		
		x.demo();    //calling userdefined method into main method
		test();		//calling userdefined method into main method
		
	}
}
