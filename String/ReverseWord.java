/*
Q1.Wap enter a string and print it in a reverse order word by word.
*/
import java.util.*;
public class ReverseWord
{
	public static void isRW(String str)
	{
		String splite[]=str.split(" ");
		for(int i=splite.length-1;i>=0;i--)
		{
			System.out.print(splite[i]+" ");
		}
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