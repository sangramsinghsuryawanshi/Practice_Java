class LongSubSum
{
	public static void isLSS(int a[],int l)
	{
		int max=0;	
		String s1="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				String s="";
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					s+=a[k];
					if(sum==l)
					{
						if(s.length()>max)
						{
							max=s.length();
							s1=s+" ";
						}
					}
				}
			}
		}
	System.out.println("Length is: "+max+" "+s1);
	}
	public static void main(String []ar)
	{
		int a[]={10,5,2,7,1,9};
		int k=15;
		isLSS(a,k);
	}
}