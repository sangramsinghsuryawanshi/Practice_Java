/**
Calculate CGPA Java Program
*/
import java.util.Scanner;
public class CGPA
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		int n = -1;
		int cnt=0,sum=0;
		System.out.println("Enter 0 to exit \nEnter the subject marks: ");
		while(n!=0)
		{
			n=sc.nextInt();
			if(n!=0)
				cnt++;
			sum+=n;
		}
		System.out.println("CGPA: "+(sum/cnt));
	}
}