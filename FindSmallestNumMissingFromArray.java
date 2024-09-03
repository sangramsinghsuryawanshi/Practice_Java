import java.util.*;
public class FindMissingFromArray
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size-1];
		System.out.print("Enter array element:");
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			if(i!=a[i])
			{
				s=i;
				break;
			}
		}
		System.out.print(s+" ");
	}
}