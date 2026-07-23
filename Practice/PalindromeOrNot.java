import java.util.*;
public class PalindromeOrNot
{
	public static String isPalindrome(int n)
	{
		int temp=n;
		int rev=0,rem=0;
		while(temp!=0)	
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}	
		if(rev==n)
		{

			return "Given String is Palindrome";
		}
		else
		{
			return "Given String is not Palindrome";
		}
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number");
		int n=sc.nextInt();
		System.out.println(isPalindrome(n));
	}
}