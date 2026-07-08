/*
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
import java.util.Scanner;
import java.util.Arrays;
public class RunningSum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int ans[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				ans[i] +=a[j]; 
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}