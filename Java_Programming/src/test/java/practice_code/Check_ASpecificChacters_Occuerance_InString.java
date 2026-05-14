package practice_code;

public class Check_ASpecificChacters_Occuerance_InString {

	public static void main(String[] args) {
		String s = "Automation with Java is amazing!";

		int total_length = s.length();// 32

		int length_afterremove = s.replace("a", "").length();
		int count = total_length - length_afterremove;
		System.out.println("Numbers of time 'a' available in this String : " + count);

	}

}
