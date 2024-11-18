/*
Q4.Wap enter a string and sort each word of string in accending and decending order by the length of each word.
*/
import java.util.*;
public class SortAsceAndDesceInLeng
{
	public static void isSAADIL(String str)
	{
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].length()<words[j].length())
				{
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		 System.out.println("Descending order by length: " + String.join(" ", words));
	}
	public static void isSAADIL1(String str)
	{
		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].length()>words[j].length())
				{
					String temp=words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		 System.out.println("Ascending order by length: " + String.join(" ", words));
	}

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String str= sc.nextLine();
		System.out.println("-------------------------");
		isSAADIL(str);
		isSAADIL1(str);
		sc.close();
	}
}