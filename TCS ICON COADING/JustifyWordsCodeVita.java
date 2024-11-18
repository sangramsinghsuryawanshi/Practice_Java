import java.util.*;
public class JustifyWordsCodeVita
{
  	public static int isJWCV(List<String> li,int readN,int maxLen)
    {
       int cntLine=1;
       int curLinLen=0;
       int wordFit=0;
       for(String w:li)
       {
         int wordLen=li.length();
         if(wordLen>maxLen)
         {
          	continue; 
         }
         if(curLinLen+(curLinLen>0?1:0)+wordLen<=maxLen)
         {
           	curLinLen+=(curLinLen>0?1:0)+wordLen;
            wordFit++;
         }
         else
         {
          	cntLine++;
           if(cntLine>readN)
           {
            	break; 
           }
           curLinLen=wordLen;
           wordFit++;
         }
       }
      return wordFit;
    }
 	public static void main(String[]ar)
    {
     	 Scanner sc = new Scanner(System.in);
      	 int size=sc.nextInt();
      	 sc.nextLine();
      	 List<String> li =new ArrayList<>();
      	 for(int i=0;i<size;i++)
         {
          	li.add(sc.nextLine().trim()); 
         }
      	 int readN=sc.nextInt();
         int maxLen=sc.nextInt();
         System.out.println(isJWCV(li,readN,maxLen));
    }
}