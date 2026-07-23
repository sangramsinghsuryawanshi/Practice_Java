import java.util.*;
public class FindMissingFromArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int a[]={1,3,4,5,6};
		int s=a[0];
		int sum=0;
		int s1=a[a.length-1];
		int size=a.length+1;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];			
		}
		int total=size*(s+s1)/2;
		System.out.print(sum/5+" ");
	}
}