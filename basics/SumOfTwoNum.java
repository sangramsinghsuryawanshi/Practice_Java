/*
Write a program to print the sum of two numbers entered by user by defining your own method.
*/
import java.util.Scanner;
public class SumOfTwoNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum of two number is: "+isSum(a,b));
	}
	public static int isSum(int a, int b)
	{
		return a+b;
	}
}