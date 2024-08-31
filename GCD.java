import java.util.*;
public class GCD
{
	public static int isGCD(int a,int b)
	{
		int gdc=0;
		for(int i=1;i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gdc=i;
			}			
		}
		
		return gdc;

	}
	public static void main(String[]ar)
	{

		int a=6,b=4;
		System.out.println("Given value is "+a+" and "+b);
		System.out.println("Given GCD is: "+isGCD(a,b));
	}
}