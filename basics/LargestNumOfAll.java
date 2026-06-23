/** Take integer inputs till the user enters 0 and print the largest number from all. */
import java.util.Scanner;
public class LargestNumOfAll
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		long n = Integer.MIN_VALUE;
		long max=0;
		while(n!=0)
		{
			long v = sc.nextInt();
			if(v == 0)
			{
				n=v;
			}else if(v>max)
			{
				max=v;
			}

		}
		System.out.println("Max Value is: "+max);
	}
}