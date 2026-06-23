public class AsecndingProg
{
	public static void main(String [] a1)
	{
		int arr[] = {0,2,1,1,4,6,3,0,1};
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int cnt=1;
				for(int j=i+1; j<arr.length;j++)
				{
				if(arr[j]!=0)
				{
					if(arr[i] > arr[j])
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j]=temp;
					}
					if(arr[i] == arr[j])
					{
						cnt++;
					}
				}
				
				}
		if(cnt==1)
		System.out.print(arr[i]+" ");
			
			}
		}
	}
}