/**
Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
*/
import java.util.Scanner;
public class SumOfNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = Integer.MIN_VALUE;
		int negSum=0,pogSum=0,pogEvenNum=0,pogOddNum=0;
		do
		{
			int num = sc.nextInt();
			if(num == 0)
			{
				n=num;
				break;
			}
			if(num < 0)
			{
				negSum +=num;
			}
			if(num > 0)
			{
				pogSum +=num;
			} 
			if(num % 2 == 0 && num > 0)
			{
				pogEvenNum += num;
			}
			if(num % 2 != 0 && num > 0)
			{
				pogOddNum +=num;
			}
		}while(n!=0);
		System.out.println("Sum of positive numbers: "+pogSum);
		System.out.println("Sum of negative numbers: "+negSum);
		System.out.println("Sum of positive even numbers: "+pogEvenNum);
		System.out.println("Sum of positive odd numbers: "+pogOddNum);
	}
}