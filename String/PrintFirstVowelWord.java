/*
Q3.Wap input a string and print only those word which first character is vowel.
*/
import java.util.*;
public class PrintFirstVowelWord
{
	public static void isPFVW(String str)
	{
		String splite[]=str.split(" ");
		int cCnt=0;
		for(int i=0;i<splite.length;i++)
		{
			if(splite[i].charAt(0)=='a' || splite[i].charAt(0)=='e' || splite[i].charAt(0)=='i' || splite[i].charAt(0)=='o' || splite[i].charAt(0)=='u')
				{
					System.out.print(splite[i]+" ");
				}
				else
				{
					cCnt++;
				}
		}
		System.out.println(" "+cCnt);
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str= sc.nextLine();
		isPFVW(str);
		sc.close();
	}
}