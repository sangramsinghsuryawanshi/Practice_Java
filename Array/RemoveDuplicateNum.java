/*
Example 1:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
public class RemoveDuplicateNum
{
	public static void main(String[]ar)
	{
		long start = System.nanoTime();
		int a[] ={1,1,2};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=-1;
				}else{
					break;
				}
			}
			if(cnt>=1 && a[i]!=-1)
			{
				System.out.print(a[i]+" ");
				count++;
			}
		}
		long end = System.nanoTime();
		System.out.println("Element: "+count+" "+(end-start)+"ns");
	}
}