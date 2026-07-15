/*
Question 10: Find Missing Number
Requirements
Array contains numbers from 1 to N.
One number is missing.
Find the missing number.
Input
5

1 2 3 5
Output
Missing Number = 4
*/
import java.util.Scanner;
public class MissingEle
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
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int n = a.length+1;
		int exp =(n*(n+1)/2);
		System.out.println("Missing ele: "+(exp - sum));
	}
}