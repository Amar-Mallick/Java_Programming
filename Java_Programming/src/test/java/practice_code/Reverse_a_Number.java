package practice_code;

public class Reverse_a_Number {

	public static void main(String[] args) {
		// Method - 01 : using String & Loops..........
		int n = 1234;
		String s = String.valueOf(n);
		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));
		}
		System.out.println();
		// Method - 02 : Using Algorithm(% & / operators.)..........
		int num = 34567;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse Number is :" + rev);

		// Method - 03 : Using StringBuffer........
		int v = 54321;
		StringBuffer sb = new StringBuffer(String.valueOf(v));
		StringBuffer revrseValue = sb.reverse();
		System.out.println(revrseValue);

	}
}
