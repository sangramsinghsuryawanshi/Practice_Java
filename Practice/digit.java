import java.util.*;
class digit
{
	public static void isDigitSum(int n)
	{
		int a[]=new int[3];
		int ind=0;
		int rem=0;
		int k=n;
		int sum=0;
		int max=0;
		int d='\0';
		while(k!=0)
		{
			rem=k%10;
			
			
			sum+=rem;
			a[ind++]=rem;
			k=k/10;
			
			
		}
		
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
				c++;
			    	
				}
			}
			if(c!=1)
			{
				if(c>max)
				{
					max=c;
					d=a[i];
				}
			}
		}
		System.out.println(sum+"<---is sum");
		System.out.println(d+"<----is mostFreq");
		
	}
	public static void main(String []args)
	{
		int n=454;
		digit d=new digit();
		d.isDigitSum(n);
	}
}