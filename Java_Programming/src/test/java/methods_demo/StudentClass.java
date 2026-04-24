package methods_demo;

public class StudentClass {
	/*
	 * Methods :- Groups of statements which helps perform some logic and task.
	 * Methods are two types - Built-in methods & user defined methods.
	 * 
	 * Methods divded in four category :
	 * 1)Take parameters and return values
	 * 2)Take parameters and no return values
	 * 3)No parameters and no return values
	 * 4)No parameters and return values*/
	//1)Take parameters and return values.....
	 int m1(int x,int y)
	{
		return(x+y);
	}
	// 2)Take parameters and no return values...
	 void m2(String name)
	 {System.out.println(name);}
    //3)No parameters and no return values........
	void  m3()
	 {System.out.println("Hello World");}
	//4)No parameters and return values.......
	String m4()
	{
	return ("Amar");	
	}
}
