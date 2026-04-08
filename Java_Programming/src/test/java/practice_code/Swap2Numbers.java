package practice_code;

public class Swap2Numbers {

	public static void main(String[] args) {
		// Method -01 >>> Using + & - Operators..
		int a=10, b=20;
		System.out.println("Before swapping value of a & b is :" + a +"  & " + b);
		a=a+b;//10+20=30
		b=a-b; //30-20=10
		a=a-b;//30-10=20
		System.out.println("After swapping value of a & b is :" + a +"  & " + b);

	}

}
