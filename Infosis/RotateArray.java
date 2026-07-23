/*
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/
import java.util.Arrays;
public class RotateArray
{
	public static void main(String[]ae)
	{
		int a[] = {1,2,3,4,5,6,7};
		int k = 3;
		int b[] = {-1,-100,3,99};
		int c = 2;
		System.out.println(Arrays.toString(rotateArray(a,k)));
		System.out.println(Arrays.toString(rotateArray(b,c)));
	}
	private static int[] rotateArray(int []a, int k)
	{
		for(int j=1;j<=k;j++)
		{
			int temp = a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
		}
		return a;
	}
}