/**
Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
*/
import java.util.Scanner;
public class MaxAndMin
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Max number: "+isMax(a,b,c));
		System.out.println("Min number: "+isMin(a,b,c));
	}
	public static int isMax(int a, int b, int c)
	{
		int max = 0;
		if(a > b && a > c)
		{
			return a;
		}
		else if( b > a && b > c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static int isMin(int a, int b, int c)
	{
		int max = 0;
		if(a < b && a < c)
		{
			return a;
		}
		else if( b < a && b < c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
}