/*
Question 7: Frequency of Each Element
Requirements
Count how many times each element appears.
Input
6
1 2 2 3 3 3
Output
1 -> 1
2 -> 2
3 -> 3
*/
import java.util.Scanner;
public class FrequencyOfEachEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int s = sc.nextInt();
		int a[] = new int[s];
		System.out.println("Enter array of element: ");
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					cnt++;
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			{
				System.out.println(a[i]+"->"+cnt);
			}
		}
	}
}