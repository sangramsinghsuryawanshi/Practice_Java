public class CountOfEle
{
	public static String isCnt(int a[])
	{
		String s="";
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				System.out.println(a[i]+" "+cnt);				
			}			
		}
	return s;
		
	}
	public static void main(String[]ar)
	{
		int a[]={2,5,34,64,23,5};
		System.out.println(isCnt(a));
	}
}