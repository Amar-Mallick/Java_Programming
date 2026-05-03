package practice_code;

public class Reverse_a_String {

	public static void main(String[] args) {
		// Method-01 : Using Loop Conditions...............
		String s = "Welcome";
		System.out.println("Before Reverse :" + s);
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		System.out.println("After Reverse :" + rev);
		
		// Method-02 : Using StringBuilders...........
		String str = "Amar";
        String revString = new StringBuilder(str).reverse().toString();
		System.out.println(revString);

	}

}
