/*
Question: Write a function to check if a given number is prime.

Input: 17
Output: true (17 is a prime number)
*/
import java.util.*;
public class CheckPrime
{
	public static Boolean isCP(int p)
	{
		int cnt=0;
		for(int i=1;i<=p;i++)
		{
			if(p%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int p = sc.nextInt();
		System.out.println(isCP(p));
	}
}