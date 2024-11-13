/*
Question: Write a function to reverse a string.

Input: "hello"
Output: "olleh"
*/
import java.util.*;
public class ReverseString
{
	public static StringBuilder isRS(String s)
	{
		return new StringBuilder(s).reverse();
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String p = sc.nextLine();
		System.out.println(isRS(p));
	}
}