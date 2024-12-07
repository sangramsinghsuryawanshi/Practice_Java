/*
16. Write a program to find the length of the longest common
subsequence between two strings.
*/
import java.util.*;
public class LongestCommonSubsequence
{
	public static int isLCS(String str1,String str2,int m,int n)
	{
		if(m==0 || n==0)
		{
			return 0;
		}
		if(str1.charAt(m-1)==str2.charAt(n-1))
		{
			return 1+isLCS(str1,str2,m-1,n-1);
		}
		return Math.max(isLCS(str1,str2,m-1,n),isLCS(str1,str2,m,n-1));
	}
	public static void main(String[]ar)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first word: ");
		String str1 = sc.next();
		System.out.println("Enter second word: ");
		String str2 = sc.next();
		int len=isLCS(str1,str2,str1.length(),str2.length());
		System.out.println("LCS Length: "+len);
	}
}