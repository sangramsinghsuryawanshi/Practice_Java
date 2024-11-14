import java.util.*;
public class CheckNextPalindromeUntileNotFound
{
	public static void isCPUNF(int a)
	{
		for(int i=a;;i++)
		{
			int rem=0,rev=0;
			for(int j=i; j!=0;j/=10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(rev==i)
			{
				System.out.println("Given Palindrome is: "+i);
				break;
			}
		}
		
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int p = sc.nextInt();
		isCPUNF(p);
	}
}