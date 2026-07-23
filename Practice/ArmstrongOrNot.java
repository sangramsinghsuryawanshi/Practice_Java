import java.util.*;
public class ArmstrongOrNot
{
	public static String isArmstrong(int n)
	{
		int temp=n;
		int rev=0,rem=0;
		while(temp!=0)	
		{
			rem=temp%10;
			rev+=(rem*rem*rem);
			temp=temp/10;
		}	
		if(rev==n)
		{

			return "Given String is Armstrong";
		}
		else
		{
			return "Given String is not Armstrong";
		}
	}
	public static void main(String[]ar)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number");
		int n=sc.nextInt();
		System.out.println(isArmstrong(n));
	}
}