//Searching for an element x in a matrix.
import java.util.*;
class SearchForXMatrix
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row and Col Value: ");
		int col=sc.nextInt();
		int row=sc.nextInt();
		int a[][]=new int[col][row];
		System.out.println("Enter Matrix Value: ");
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int x=4;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==x)
				{
					System.out.println("X Value Located at: "+i+","+j);
				}
			}
		}
	}
}