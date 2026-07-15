/*
Question 1: Matrix Addition
Requirements
Read two matrices.
Print their sum.
Input
Matrix A

1 2
3 4

Matrix B

5 6
7 8
Output
6 8
10 12
*/
import java.util.Scanner;
import java.util.Arrays;
public class MatrixAddition
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rows and column of matrix A: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int m[][] = new int[r][c];
		System.out.println("Enter A matix element: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter a rows and column of matrix B: ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int m1[][] = new int[r1][c1];
		System.out.println("Enter B matix element: ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		int ans[][] = new int[r][c];
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
			{
				ans[i][j] = m[i][j]+m1[i][j];
			}
		}
		System.out.println("Addition of two Matix is: ");
		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans.length;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}