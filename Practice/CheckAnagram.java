/*
2. Anagram Check
Problem Statement: Given two strings, check if one string is an anagram of another.
Input:
Two strings str1 and str2.
Output:
YES if they are anagrams, NO otherwise.
Example:
Input: "listen", "silent"
Output: "YES"
*/
import java.util.*;
class CheckAnagram
{
	public static String isAnagram(String s,String s1)
	{
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch,ch1))
		{
			return "yes";
		}
		else
		{
			return "no";
		}
	}
	public static void main(String[]ar)
	{
		String s="listen";
		String s1="silent";
		System.out.println(isAnagram(s,s1));
	}
}