/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
*/
import java.util.Arrays;
public class ValidAnagram
{
	public static void main(String[] aeg)
	{
		String s = "anagram";
		String t = "nagaram";
		char a[] = sortString(s);
		char b[] = sortString(t);
		if(Arrays.equals(a,b))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	private static char[] sortString(String s)
	{
		char ch [] = s.toCharArray();
		int left = 0;
		int right = ch.length-1;
		while(ch[left] > ch[right])
		{
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right]=temp; 
			left++;
			right--;
		}
		System.out.println(Arrays.toString(ch));
		return ch;
	}
}
