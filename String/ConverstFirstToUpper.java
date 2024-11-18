/*
Q5.Wap enter a string in lowercase now you have to convert every first character of the word in upper case. 
*/
import java.util.*;
public class ConverstFirstToUpper
{
	public static void isRW(String str)
	{
		String splite[]=str.split(" ");
		int cCnt=0,wCnt=0;
		String upp="";
		for(int i=0;i<splite.length;i++)
		{
			upp+=Character.toUpperCase(splite[i].charAt(0))+splite[i].substring(1)+" ";			
		}
		System.out.println(upp+" "+cCnt);
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