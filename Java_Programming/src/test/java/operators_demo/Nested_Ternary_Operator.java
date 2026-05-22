package operators_demo;

public class Nested_Ternary_Operator {

	public static void main(String[] args) {
		int age=25;
		String result=(age<18)?" Not Eligible for Vote":
			(age>21)?"Eligible for Married":"Not Eligble for Married";
		System.out.println(result);//Eligible for Married
	}

}
