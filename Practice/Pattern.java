/*
	8. WAP for star pattern

*
* *
* * *
* * * *

*/
public class Pattern{
public static void main(String []ar){
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}