public class MaxSubarraySum
{
	public static void main(String []ar)
	{
		int a[] = {-5,-3,2,-8};
		int k=3,sum=0,cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] < 0 && cnt<=k)
			{
				a[i]=-1*a[i];
				cnt++;
				System.out.println(cnt+" "+a[i]);
			}
			sum+=a[i];
		}
		System.out.println(sum);
	}
}