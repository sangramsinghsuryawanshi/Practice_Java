/*
	
7. Given an array of Integers , among the elements find the pair whose sum is equal to a given number

*/
public class Pairs{
	public static void main(String[]ar){
		int a[]={1,2,34,5,-2};
		int t=3;
		for(int i=0;i<a.length;i++){
			int sum=0;
			for(int j=i+1;j<a.length;j++){
				sum=a[i]+a[j];
				if(sum==t){
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
}
			