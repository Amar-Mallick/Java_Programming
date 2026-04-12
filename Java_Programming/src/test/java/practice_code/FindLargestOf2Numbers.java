package practice_code;

public class FindLargestOf2Numbers {

	public static void main(String[] args) {
		// Method 01->> Using If else conditions...........
		int a=10,b=100;
		if (a>b) {
			System.out.println("a is largest number..");
		}else if(a<b) {
			System.out.println("b is largest number..");
		}else {
			System.out.println("both are same...");
		}
		//Meethod 2_>> Using Ternary Opeartors.................
		int c=15,d=25;
		int x=(c<d)?c:d;
		System.out.println(x); //if condition is true resuit1 will be outcome ...

	}

}
