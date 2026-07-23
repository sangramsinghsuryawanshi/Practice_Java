class HollowP
{
	public static void isP(int n)
	{
		int k=8,l=8;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n)
				{
					System.out.print(j+" ");
				}
				else if(j==1)
				{
					System.out.print(k--+" ");
				}
				else if(j==n)
				{
					System.out.print(l--+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}
	public static void main(String []a)
	{
		int n=9;
		isP(n);
	}
}