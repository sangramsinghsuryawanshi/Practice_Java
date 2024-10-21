class PeakElement
{
	public static void isPE(int n[])
	{
		if(n[0]>n[1]) 
		{
            		System.out.println(n[0]);
        	}
		for(int i=1;i<n.length;i++)
		{
			if(n[i]>n[i-1] && n[i]>n[i+1])
			{
				System.out.println(n[i]);
			}			
		}
		if(n[n.length-1]>n[n.length - 2]) 
		{
            		System.out.println(n[n.length-1]);
        	}
	}
	public static void main(String []ar)
	{
		int n[]={16,17,4,3,5,2};
		isPE(n);
	}
}