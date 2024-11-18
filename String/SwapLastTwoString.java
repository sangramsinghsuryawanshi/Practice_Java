/*
Q9. Write a Java program to create a new string from a given string swapping the last two 
characters of the given string. The length of the given string must be two or more.
Sample Output:
The given strings is: string 
The string after swap last two characters are: strign

*/
import java.util.*;
public class SwapLastTwoString
{
	public static void isRW(String str)
	{
		char ch[]=str.toCharArray();
		int cCnt=0,wCnt=0;
		for(int i=0;i<ch.length;i++)
		{
			if(i==ch.length-2)
			{
				char c=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=c;
			}			
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]+"  ");
		}
		System.out.println(wCnt+" "+cCnt);
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str= sc.nextLine();
		isRW(str);
		sc.close();
	}
}