public class StringReverse{
	public static void main(String[]ar){
		String str="Hello";
		System.out.println("Reverse String is: ");
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}