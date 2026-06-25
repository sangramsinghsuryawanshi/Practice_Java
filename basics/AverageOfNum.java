/** Calculate Average Of N Numbers */
import java.util.Scanner;
public class AverageOfNum
{
	public static void main(String[]are)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n number: ");
		int n = sc.nextInt();
		int temp = n;
		int cnt=0,sum=0;
		while(temp!=0)
		{
			int rem = temp%10;
			sum+=rem;
			cnt++;
			temp/=10;
		}
		System.out.println("Average is: "+(double)sum/cnt);
	}
}