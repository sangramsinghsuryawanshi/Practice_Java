/*
[1, 2, 3, 4, 6, 8, 9]

Target = 10
*/
public class TwoSumUsingTwoPointer
{
	public static void main(String[]ar)
	{
		int []a = {1, 2, 3, 4, 6, 8, 9};
		int t = 10;
		int left = 0, right = a.length-1;
		while(left < right)
		{
			int sum = a[left] + a[right];
			if(sum == t)
			{
				System.out.println(left+" - "+right);
				left++;
				right--;
			}
			else if(a[right]>sum)
			{
				right--;
			}
			else
			{
				left++;
			}
		}
	}
}