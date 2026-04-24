package constructor_demo;

public class DemoClass {
	/*Constructor : 1) It's two types -> Default Constructor & Parameterised Constructor..
	 * 2)Which  Constuctor not take any parameter is known as default constructor,
	 * Which take known as Parameterised Constructor..
	 * 3) Constructor name same as Class name..
	 * Constructor not return any value also not void..
	 * When create an object of class it's automatically invoked.
	 * It's generally used for intialized the Values of varriables..
	 * 
	 * */
	DemoClass()//Example of default Constructor.......
	{ 
		String  name = "Hello World...";
		System.out.println(name);
	}

	public static void main(String[] args) {
		DemoClass sc = new DemoClass();
		

	}

}
