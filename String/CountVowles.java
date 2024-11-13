/*
Question: Write a function to count the number of vowels in a string.

Input: "OpenAI"
Output: 3 (vowels: O, e,
*/
import java.util.*;
public class CountVowles
{
	public static int isCV(String s)
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				cnt++;
			} 
		}
	return cnt;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String p = sc.nextLine();
		System.out.println(isCV(p));
	}
} 
