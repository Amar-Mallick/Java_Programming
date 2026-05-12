package practice_code;

public class Check_Palindrome_String {

	public static void main(String[] args) {
		// Using For loop..............
		String s = "MADAM";

		String revs = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			revs = revs + s.charAt(i);
		}
		System.out.println("Reverse value : " + revs);
		// .equals() compares the actual values/content of strings.
		if (s.equals(revs)) {
			System.out.println(s + " : It's a Palindrome String");

		} else {
			System.out.println(s + " : It's not  a Palindrome String");
		}

		// Using For -each loop...............
		String str = "MALAYALAM";
		String reverse = "";
		char[] ch = str.toCharArray();
		for (char c : ch) {
			reverse = c + reverse;
		}
		System.out.println("Reverse value  : " + reverse);
		if (str.equals(reverse)) {
			System.out.println(str + " : It's a Palindrome String");

		} else {
			System.out.println(str + " : It's not  a Palindrome String");
		}

	}

}
