package methods_demo;

public class MainStudentClass {

	public static void main(String[] args) {
		StudentClass sc = new StudentClass();
		int sum = sc.m1(10,20);
		System.out.println(sum);
		sc.m2("Hello");
		sc.m3();
		String name  =sc.m4(); 
		System.out.println(name);

	}

}
