/*
     1
   * 2 *
 * * 3 * *
*/
public class Pattern2{
public static void main(String []ar){
	int n=5;
	int num=1;
	for(int i=1;i<=n;i+=2)
	{
		for(int j=n;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			if(i==1 ||  i/2==k-1){
				System.out.print(num+++" ");
			} else{
				System.out.print("* ");
			}
		}
		System.out.println();
	}

	}
}