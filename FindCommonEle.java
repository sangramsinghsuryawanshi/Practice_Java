public class FindCommonEle
{
	public static String isCommon(int a[],int b[])
	{
		String s="";
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					cnt++;
				}
			}
			if(cnt>=1)
			{
				s+=a[i]+" ";
			}			
		}
	return s;
		
	}
	public static void main(String[]ar)
	{
		int a[]={2,5,34,64,23,6};
		int b[]={2,5,3,6,22,62};
		System.out.println(isCommon(a,b));
	}
}