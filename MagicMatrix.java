import java.util.*;
public class MagicMatrix
{
	public static void isSeconLarge(int a[][])
	{
		int dsum=0,cnt=0,sdsum=0;
		for(int i=0;i<a.length;i++)
		{
			int lsum=0;
			int rsum=0;
			for(int j=0;j<a[i].length;j++)
			{
				lsum+=a[i][j];
				rsum+=a[j][i];
				if(i==j)
				{
					dsum+=a[i][j];
				}
				if((i+j)==(a.length-1))
				{
					sdsum+=a[i][j];
				}
			
			}
			if(lsum!=rsum)
			{
				cnt=1;
				break;
			}
		}
			if(cnt==0 && dsum==sdsum)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
	}
	public static void main(String[]ar)
	{

		int a[][]={{1,2},{1,2},{1,1}};
		isSeconLarge(a);
	}
}