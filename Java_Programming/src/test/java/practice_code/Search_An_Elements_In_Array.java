package practice_code;

public class Search_An_Elements_In_Array {

	public static void main(String[] args) {
		// Searching an Eleemnts in Array using Linear Search.........
		// Linear Search means Check easy & every elements in Array.......
		int e[] = { 10, 20, 30, 35, 45, 50 };
		int searchElement = 50;
		boolean status = false;
		
		// Using For Loop............
		/*
		 * for (int i = 0; i < e.length; i++) { if (e[i] == searchElement) {
		 * System.out.println("Element is Present..."); status = true; break; } }
		 */
		// Using For Each Loop...................
		for (int x : e) {
			if (x == searchElement) {
				System.out.println("Element is Present...");
				status = true;
				break;
			}
		}
		if (status == false) {
			System.out.println("Element is Not  Present...");
		}

	}

}
