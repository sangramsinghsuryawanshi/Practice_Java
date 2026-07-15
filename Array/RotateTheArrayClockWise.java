/*
Question 9: Right Rotate an Array by One Position
Requirements
Rotate elements right by one position.
Input
5
10 20 30 40 50
Output
50 10 20 30 40
*/
import java.util.Scanner;
import java.util.Arrays;
public class RotateTheArrayClockWise
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
		int temp = a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}
}