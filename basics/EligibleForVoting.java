/*
A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
*/
import java.util.Scanner;
public class EligibleForVoting
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age: ");
		int a = sc.nextInt();
		isAgeValid(a);
	}
	public static void isAgeValid(int a)
	{
		if(a >= 18)
		{
			System.out.println("Given person is eligible to vote");
		}else{
			System.out.println("Given person is not eligible to vote");
		}
	}
}