import java.util.Scanner;
public class FactorsOfNum
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+",");
			}
		}
	}
}