/*
Question 3: Reverse an Array
Requirements
Reverse the array without using another array.
Input
5
1 2 3 4 5
Output
5 4 3 2 1
*/
import java.util.Scanner;
public class ReverseArray
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
		System.out.println("Reverse Array: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}
}