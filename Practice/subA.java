public class subA
{
	public static void issub(int a[])
	{
		int max=0;
		String b=" ";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
				
				sum+=a[k];
				if(sum>max)
				{
					max=sum;
					b+=a[k];
				}
					
				}
			}
		}
		System.out.println(b);
	System.out.println(max);

	}
	public static void main(String []args)
	{
		int a[]={5,4,-1,7,8};
		subA arr=new subA();
		arr.issub(a);
	}
}