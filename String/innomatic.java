import java.util.*;
interface calculation
{
	public abstract int isSum(int a,int b);
	public List<String> isPair(int n);
	
}
class Imple implements calculation
{
	public int isSum(int a,int b)
	{
		return a+b;
	}
	public List<String> isPair(int n){
		List<String> li = new ArrayList<String>();
		for(int i=1;i<=n;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				sum=j+i;
				if(sum==n)
				{
					li.add(i+"+"+j+"="+sum);
				}
			}
		}
		return li;
	}
}
class innomatic
{
	public static void main(String []args) 	{
	
	Imple i = new Imple();
	System.out.println(i.isSum(20,40));
	System.out.println(i.isPair(40)+"\n");
					
	}	
}