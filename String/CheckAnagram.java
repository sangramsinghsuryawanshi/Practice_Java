/*
Question: Write a function to check if two strings are anagrams.

Input: "listen", "silent"
Output: true (they are anagrams)
*/
import java.util.*;
public class CheckAnagram
{
	public static boolean isCAG(String s,String p)
	{
		char ch[]=s.toCharArray();
		char ch1[]=p.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1))
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
		System.out.println("Enter given Two String: ");
		String p = sc.nextLine();
		String s = sc.nextLine();
		System.out.println(isCAG(p,s));
	}
}