/*
18. Write a program to find all permutations of a string.
*/
import java.util.*;
public class StringPermutaion
{
	public static void isStringPermutaion(String str1,String v)
	{
		if(str1.length()==0)
		{
			System.out.println(v+" ");
		}
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			String s = str1.substring(0,i)+str1.substring(i+1);
			isStringPermutaion(s,v+ch);
		}
	}
	public static void main(String[]ar)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value: ");
		String str1 = sc.next();
		isStringPermutaion(str1,"");
	}
}