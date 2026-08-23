package most_ask_questions;

public class Remove_ChunkOrSpecial_Character_In_String {

	public static void main(String[] args) {
		String s= "Am12344&^%$a!@#$%rskhjl";
		 String st = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(st);//Amarskhjl
		
		String xString ="23255!#()&*S&(*)(O*^^%N";
		 String x = xString.replaceAll("[^A-Za-z]", "");//[^A-Za-z]-only keep A-Z&a-z
		 System.out.println(x);//SON
		

	}

}
