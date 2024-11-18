/*
Q2.Wap enter a string and find the count of word and character(excluding space).
*/
import java.util.*;
public class FindCntOfCharAndWord
{
	public static void isRW(String str)
	{
		String splite[]=str.split(" ");
		int cCnt=0,wCnt=0;
		for(int i=0;i<splite.length;i++)
		{
			wCnt++;
			for(int j=0;j<splite[i].length();j++)
			{
				cCnt++;
			}
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