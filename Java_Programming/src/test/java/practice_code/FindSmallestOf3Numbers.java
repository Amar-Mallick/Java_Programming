package practice_code;

public class FindSmallestOf3Numbers {

	public static void main(String[] args) {
		int a = 100, b = 155, c = 30;
		if (a < b && a < c) {
			System.out.println("a is small");
		} else if (b < a && b < c) {
			System.out.println("b is small");
		} else {
			System.out.println("c is small");
		}

	}

}
