import java.util.*;
public class HollowPatternUsingWhileTwentyOne
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number:");
		int n=sc.nextInt();
		System.out.println("----------------------");
		int i=1;
		while(i<=n)
		{
			int k=n;
			while(k>=i)
			{
				System.out.print(" ");
			k--;
			}
				int j=1;
				while(j<=i)
				{
					if(j==1 || j==i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				j++;
				}
			System.out.println();
		i++;
		}
		i=1;
		while(i<=n)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(" ");
			k++;
			}
				int j=n;
				while(j>=i)
				{
					if(j==n || j==i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				j--;
				}
			System.out.println();
		i++;
		}

	}
}