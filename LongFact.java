import java.math.BigInteger;
public class LongFact{
	public static void main(String[]ar){
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=100;i++){
			fact=fact.multiply(BigInteger.valueOf(i));			
		}
		
		System.out.println(fact);
	}
}	