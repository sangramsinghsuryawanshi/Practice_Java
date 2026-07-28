public class MinValue{
public static void main(String[]arg){
	int a[]={12,34,56,1,3};
	int min=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++){
		if(a[i]<min){
			min=a[i];
			}
		}
	System.out.println("Min value is: "+min);
	}
}