/**
Sum Of A Digits Of Number
*/
import java.util.Scanner;
public class SumOfDig
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit: ");
		int d = sc.nextInt();
		int temp = d;
		int sum=0;
		while(temp!=0)
		{
			int rem = temp%10;
			sum+=rem;
			temp/=10;
		}
		System.out.println("Sum of digits: "+sum);
	}
}