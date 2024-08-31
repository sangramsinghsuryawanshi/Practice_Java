import java.util.*;
class Intesection{
public static void main(String[] args){
      int[] arr={1,2,3,4,5};
      int[] arr1={1,9,3,8,5};
      int[] c=new int[arr.length+arr1.length];
         int x=0;
         for(int i=0;i<c.length;i++){
            if(i<arr.length){
              c[i]=arr[i];
             }else{ 
              c[i]=arr1[x++];
            }
         }
      for(int i=0;i<c.length;i++){
          int cnt=0;
          for(int j=i+1;j<c.length;j++){
             if(c[i]==c[j]){
               cnt++;
               c[j]=0;
            }
             
          }
          if(cnt!=0 && c[i]!=0){
             System.out.print(c[i]+" ");
          }
        }
    }
}
