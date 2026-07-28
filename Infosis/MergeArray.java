/*
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/
import java.util.Arrays;
public class MergeArray
{
	public static void main(String[]ar)
	{
		int a[] = {1,2,3,0,0,0};
		int b[] = {2,5,6};
		int m=3,n=3;
		int i = m-1,j=n-1,k=m+n-1;
		while(i>=0 && j>=0)
		{
			if(a[i] > b[j])
			{
				a[k] = a[i];
				i--;
			}
			else
			{
				a[k] = b[j];
				j--;
			}
			k--;
		}
		while(j>=0)
		{
			a[k] = b[j];
			j--;
			k--;
		}
		System.out.println(Arrays.toString(a));
	}
}