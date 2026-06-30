/**
Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
*/
import java.util.*;
public class GoOutToWithFriends
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				cnt++;
		}
		System.out.println("the number of days kunal go out is: "+cnt);
	}
}