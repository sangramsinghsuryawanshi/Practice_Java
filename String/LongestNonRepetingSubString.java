/*
Question: Write a function to find the longest substring without repeating characters in a given string.

Input: "abrkaabcdefghijjxxx"
Output: "abcdefghij"
*/
import java.util.*;
public class LongestNonRepetingSubString
{
	public static String isLNRS(String s)
	{
		int max=Integer.MIN_VALUE;
		String lon="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String str=s.substring(i,j+1);
				//System.out.println(str+" ");
				int cnt=0;
				for(int k=0;k<str.length();k++)
				{
					for(int l=k+1;l<str.length();l++)
					{
						if(str.charAt(k)==str.charAt(l))
						{
							cnt++;
						}			
					}
				}
				if(cnt==0)
				{
					if(str.length()>max)
					{
						max=str.length();
						lon=str;
					}
				}
			}			
		}	
	return lon;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String p = sc.nextLine();
		System.out.println(isLNRS(p));
	}
} 
