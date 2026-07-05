/*
Define a method that returns the product of two numbers entered by user.
*/
import java.util.Scanner;
public class ProductOfTwoNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Product of two number is: "+isPro(a,b));
	}
	public static int isPro(int a, int b)
	{
		return a*b;
	}
}