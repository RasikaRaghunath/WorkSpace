package javaProject;

public class ArmstrongNumber 
{
	//Armstrong number example 153=1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
	public static void main(String[] args)
	{
	int num=153, c=num;
	int rem=0;
	int arm=0;  //1
	while(num>0)               //125>0  12>0   1>0   0>0
	{
		System.out.println(num);
		System.out.println("***************************");
		rem=num%10;              //125%10=5  12%10=2  1%10=0
		System.out.println(rem);
		arm=arm+(rem*rem*rem);          //0+125=125  8+125=133  133+1=134
		System.out.println(arm);
		num=num/10;  //125/10= 12  12/10=1  1/10=0
		System.out.println(num);
		System.out.println("***************************");
		
	}
	if(c==arm)  
	{System.out.println("The number is armstrong number");}
	else
	{System.out.println("The number is not armstrong number");}
	}	
}
