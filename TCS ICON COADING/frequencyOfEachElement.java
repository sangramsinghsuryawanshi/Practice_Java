/*
Count the frequency of each element in an array

Input: Array: [1, 3, 3, 7, 5, 5, 5]
*/
class frequencyOfEachElement
{
	public static void isFOEE()
	{
		int a[]={1, 3, 3, 7, 5, 5, 5};
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=-1;
				}
			}
		if(a[i]!=-1)
		System.out.println(a[i]+" "+cnt);
		}
	}
	public static void main(String[]ar)
	{
		isFOEE();
	}
}	