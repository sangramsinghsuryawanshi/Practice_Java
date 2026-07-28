/*
1. Palindrome String
Problem Statement: Given a string, check whether it is a palindrome or not.
Input:
A single string S.
Output:
YES if the string is a palindrome, NO otherwise.
Example:
Input: "madam"
Output: "YES"
*/
import java.util.Scanner;
class CheckPalindrome
{
	public static String isPal(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		if(sb.toString().equals(s))
		{
			return "Yes";
		}
		else
		{
			return "No";
		}
	}
	public static void main(String[]sr)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		System.out.println(isPal(s));
	}
}