import java.util.*;
public class FactoOfGivenNum
{
	public static int isFactReady(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number");
		int n=sc.nextInt();
		System.out.println("Factorial of given number is: "+isFactReady(n));
	}
}