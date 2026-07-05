/*
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
*/
import java.util.Scanner;
public class FactorialOfNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		if(a == 0 || a==1)
		{
			System.out.println("Factorial of num is: "+a);
		}else{
			isFactOfNum(a);
		}
	}
	public static void isFactOfNum(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of num is: "+fact);
	}
}