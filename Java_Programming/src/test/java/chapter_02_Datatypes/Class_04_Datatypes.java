package chapter_02_Datatypes;

import java.util.Arrays;

public class Class_04_Datatypes {
//Refer the JavaDatatypeCheatsheet.md file for learn more  about datatypes in java
	public static void main(String[] args) {
		//Ex:- Primitive Datatype..............
		byte number= 25;
		int price= 250;
		System.out.println(number + " "  + price);
		long capitalValue=12330000000000000L;
		System.out.println(capitalValue);
		
		char grade='A';
		System.out.println(grade);
		 boolean isCodeDisplayed=true;
		 System.out.println("Check code is visible " + isCodeDisplayed);
		 
		
		
		//Ex : Non-Primitive Datatype....
		
		String course= "Selenium-Java";
		System.out.println("Course name is :->" + course); //output :-Course name is :->Selenium-Java
		
		int numbers[]= {12,24,48,54};
		System.out.println("Numbers are -" + Arrays.toString(numbers));//output :- Numbers are -[12, 24, 48, 54]
		
		
		

	}

}
