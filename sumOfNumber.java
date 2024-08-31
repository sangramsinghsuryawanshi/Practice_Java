import java.util.*;
public class sumOfNumber
{
	public static int isSum(int n)
	{
		int temp=n;
		int rev=0,rem=0;
		while(temp!=0)	
		{
			rem=temp%10;
			rev+=rem;			
			temp=temp/10;
		}	
		return rev;
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number");
		int n=sc.nextInt();
		System.out.println("Sum of given number: "+isSum(n));
	}
}