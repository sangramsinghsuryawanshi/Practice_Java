/*
Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*/
public class InverAndReverseTheImage
{
	public static void main(String[]ar)
	{
		int img[][] = {{1,1,0},{1,0,1},{0,0,0}};
		for(int i=0;i<img.length;i++)
		{
			int left=0;
			int right = img[i].length-1;
			while(left < right)
			{
				int temp = img[i][left];
				img[i][left]=img[i][right];
				img[i][right]=temp;
		                left++;
                		right--;
			}
			
		}
		for(int i=0;i<img.length;i++)
		{
			for(int j=0;j<img[i].length;j++)
			{
				if(img[i][j]==1)
				{
					img[i][j]=0;
				}
				else if(img[i][j]==0)
				{
					img[i][j]=1;
				}
				System.out.print(img[i][j]+" ");
			}
			System.out.println();
		}
	}
}