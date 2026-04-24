package constructor_demo;

public class School {
	int sid;
	String sname;

	public School(int id, String name) // Example of Parameterized Constructor....
	{
		sid = id;
		sname = name;
	}

	public static void main(String[] args) {
		School S = new School(5, "DPS");
		System.out.println("School ID :" + S.sid  + "   School Name :" +  S.sname);
	}

}
