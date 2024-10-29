/*
Counting Elements Greater than Previous Elements in Array

Input:
Copy code
5
7 4 8 2 9
Output: 3
*/
class CountingEleGreaterThanPreviousEle
{
	public static void isCEGTPE(int a[])
	{
		int cnt=0;
		for(int i=0;i<a.length-1;i++)
		{
			
				if(a[i]<a[i+1])
				{
					cnt++;
				}	
			
		}
	System.out.println(cnt);
	}
	public static void main(String[]ar)
	{
		int a[]={5,7, 4, 8, 2, 9};
		isCEGTPE(a);
	}
}