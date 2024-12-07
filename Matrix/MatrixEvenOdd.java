/*
14. MATRIX EVEN ODD
You are required to input the size of the matrix then the elements of
matrix, then you have to divide the main matrix in two sub matrices
(even and odd) in such a way that element at 0 index will be considered
as even and element at 1st index will be considered as odd and so on.
Then you have sort the even and odd matrices in ascending order and
print the sum of second largest number from both the matrices.
Example
enter the size of array : 5
enter element at 0 index : 3
enter element at 1 index : 4
enter element at 2 index : 1
enter element at 3 index : 7
enter element at 4 index : 9
Sorted even array : 1 3 9
Sorted odd array : 4 7
Sum = 7
*/
import java.util.*;
public class MatrixEvenOdd
{
	public static int isMatrixEvenOdd(int a[])
	{
		Set<Integer> even = new LinkedHashSet<>();
		Set<Integer> odd = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				even.add(a[i]);
			}
			else
			{
				odd.add(a[i]);
			}
		}
		List<Integer> l1 = new ArrayList<>(even);
		List<Integer> l2 = new ArrayList<>(odd);
		Collections.sort(l1);
		Collections.sort(l2);
		int sum = l1.get(l1.size()-2)+l2.get(l2.size()-2);
	return sum;
	}
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Sum :"+isMatrixEvenOdd(a));
	}
}