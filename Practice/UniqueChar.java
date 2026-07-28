public class UniqueChar{
	public static void main(String[]ar){
		String str="Heelo";
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)){
					cnt++;
				}
			}
		}
		if(cnt==0){
			System.out.println("Its is unique element");
		}
		else{
			System.out.println("Its is not unique element");
		}
	}
}