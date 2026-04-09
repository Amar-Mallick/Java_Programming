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
		// Method -02 >>> Using X & / Operators..
		int c=10,d=20;
		c= c*d;//10x20=200
		d=c/d;//200/20=10
		c=c/d;//200/10=20
		System.out.println( "c :=" + c +" & " + "d := "+  d);
		//Method -03 >>> Using 3rd variables.............
		int x=30,y=40;
		int z= x;
		x=y;
		y=z;
		System.out.println("X value is :"+ x + "  y value is :"+ y);
		

	}

}
