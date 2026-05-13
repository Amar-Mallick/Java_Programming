package learning_String;

public class String_Demo {

	public static void main(String[] args) {
		// Varrious built-in methods of String........
		String s = "Welcome";
		// Method 01->>> length()-get the character numbers present in String.
		int size = s.length();
		System.out.println("String size : " + size);// 7
		// Method 02 ->> toUpperCase() - convert all characters into capital letters.
		System.out.println(s.toUpperCase());// WELCOME
		// Method 03 ->> tolowerCase() - convert all characters into small letters.
		System.out.println(s.toLowerCase());// welcome
		// Method 04 ->>charAt(index) - using index number get character values of
		// specific index.
		// In java index start from 0 & last index number is total length -1;
		System.out.println(s.charAt(0));// W
		System.out.println(s.charAt(1));// e
		// System.out.println(s.charAt(7));//StringIndexOutOfBoundsException
		// (Index 7 out of bounds for length 7)
		// Method 05 ->>equalsIgnoreCase(string) - compare both values ignore case
		String t = "welcome";
		System.out.println(s.equalsIgnoreCase(t));// rue
		// Method 06 ->>equals() - compare both string not ignore case..
		System.out.println(s.equals(t));// false
		// Method 07 ->>contains() - check one string value present in other String
		String v = "come";// true(remeber Java is Case sensitive Languages)
		System.out.println(s.contains(v));
		// Method 08 ->> trim()- use to remove any unwanted whitespaces at the start or
		// the end of String.
		String x = "         Amar   ";// Amar
		System.out.println(x.trim());
		// Method 09 ->> split()- solit the string by using delimeters
		String z = "Hello-World";
		String[] sp = z.split("-");
		System.out.println(sp[0]);// Hello
		System.out.println(sp[1]);// World
		// Method 10 ->> concat()- Add two Strings(using + operator we can concat also)
		System.out.println(s.concat(" to Java"));// Welcome to Java
		// Method 11 ->> replaceAll()
		// - when replacing patterns like:digits,spaces,special characters,multiple
		// matches using regex.
		String g = "Abc123xy4z345ghij754qrp";
		System.out.println(g.replaceAll("[0-9]", ""));// Abcxyzghijqrp
		// Method 12 ->>replace()-replacing normal characters or words..
		System.out.println(s.replace('e', 'x'));// Wxlcomx
		String n = "I love Selenium";
		System.out.println(n.replace("Selenium", "PlayWright"));
		// Method 13 ->>subString() -beginIndex the beginning index, inclusive.
		System.out.println(s.substring(3));// come
		System.out.println(s.substring(0, 3));// Wel(starting index inclusivebuy ending exclusive)
		// Method 14 ->> Use to get the index number..
		System.out.println(s.indexOf('l'));// 2
		// Method 15->>compareTo() - compare Ascii code/unicode
		/*
		 * Output will be +value : If first string is greater than second string. Output
		 * will be -value : If first string is smaller than second string.
		 *  Output will be   0 : If both Strings are same
		 * 
		 */
		String a1 = "A";
		String a2 = "B";
		System.out.println(a1.compareTo(a2));// -1
	}

}
