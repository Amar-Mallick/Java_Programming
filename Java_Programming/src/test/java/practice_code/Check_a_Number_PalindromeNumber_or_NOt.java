package practice_code;

public class Check_a_Number_PalindromeNumber_or_NOt {

	public static void main(String[] args) {
		// After reversing a number is same as Original Number Known as Palindrome

		int origin_Number = 123321;
		int temp = origin_Number;
		int rev_Number = 0;
		while (origin_Number != 0) {
			// 1. Get the last digit and add to reversed number
			rev_Number = rev_Number * 10 + origin_Number % 10;
			// 2. Remove the last digit from the original number
			origin_Number = origin_Number / 10;

		}
		System.out.println(rev_Number);
		if (rev_Number == temp) {
			System.out.println("It's a Palindrome Number");
		} else {
			System.out.println("It's not a Palindrome Number");
		}
	}

}
