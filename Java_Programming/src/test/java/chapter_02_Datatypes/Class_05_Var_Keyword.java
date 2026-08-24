package chapter_02_Datatypes;



public class Class_05_Var_Keyword {

	public static void main(String[] args) {
		// In Java-10 onwards we can use var for create  local variable.
		//Java automatically figures out the data type based on the value you give it.
		// But, we can not make the syntax in separete like declaration and initialization for var.
		
		var number=15;
		System.out.println(number);//15
		
		var name="Amar";
		System.out.println("Name is : "+ name);//Name is : Amar
		
	}

}
