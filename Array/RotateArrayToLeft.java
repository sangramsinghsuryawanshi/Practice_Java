/*
Question 8: Left Rotate an Array by One Position
Requirements
Rotate elements left by one position.
Input
5
10 20 30 40 50
Output
20 30 40 50 10
*/
import java.util.Scanner;
import java.util.Arrays;
public class RotateArrayToLeft
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
		int temp = a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	}
}