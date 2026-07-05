/**
Define a program to find out whether a given number is even or odd.
*/
import java.util.Scanner;
public class EvenOdd
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		isEvenOdd(a);
	}
	public static void isEvenOdd(int a)
	{
		if(a%2==0)
		{
			System.out.println("Given number is even");
		}else{
			System.out.println("Given number is odd");
		}
	}
}