/*
Question: Write a function to find the first non-repeating character in a string.

Input: "swiss"
Output: "w"
*/
import java.util.*;
public class NonRepeatingChar
{
	public static char isNRC(String s)
	{
		int s1=1;
		char c=' ';
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{	
			int cnt=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]='0';
				}
			}
			if(cnt==0 && ch[i]!='0' && s1==1)
			{
				c=ch[i];
				s1++;
			}
		}
	return c;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String p = sc.nextLine();
		System.out.println(isNRC(p));
	}
} 
