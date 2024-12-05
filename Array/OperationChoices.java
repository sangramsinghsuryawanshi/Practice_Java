/*
5. Operation Choices
Write a function OperationChoices(c, a, b) which will accept three
integers as an argument, and the function will return:
(a + b) if the value of c=1.
(a – b) if the value of c=2.
(a * b) if the value of c=3.
(a / b) if the value of c=4.
Sample Test Case:
Input:
2
15
20
Output:
-5
Here, the value of the c is two i.e 2. So it’ll perform the operation as
subtraction (15, 20) and will return -5. 
*/
import java.util.*;
public class OperationChoices
{
	public static int isOperationChoices(int c, int a, int b)
	{
		if(c==1)
		{
			return a+b;
		}
		else if(c==2)
		{
			return a-b;
		}
		else if(c==3)
		{
			return a*b;
		}
		else if(c==4)
		{
			return a/b;
		}
		else
		{
			System.out.println("Enter Valid choice");
		}
	return -1;
	}
	public static void main(String[]ar)	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int c=sc.nextInt();
		System.out.println("Enter Two values: ");
		int a =sc.nextInt();
		int b=sc.nextInt();
		System.out.println(isOperationChoices(c, a, b));
	}
}