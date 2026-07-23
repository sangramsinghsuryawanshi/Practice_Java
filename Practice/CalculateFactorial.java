public class CalculateFactorial
{
	public static int isFact(int a)
	{	
		int fact=1;	
		for(int i=1;i<=a;i++)
		{
			fact*=i;	
		}
		return fact;		
	}
	public static void main(String[]ar)
	{
		int a=4;
		System.out.println("Factorial is: "+isFact(a));
	}
}