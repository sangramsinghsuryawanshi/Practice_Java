import java.util.*;
public class LeapYearOrNot
{
	public static boolean isLeap(int n)
	{
		return (n%4==0 && n%100!=0)||(n%400==0);
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number");
		int n=sc.nextInt();
		if(isLeap(n))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is a not leap year");
		}
	}
}