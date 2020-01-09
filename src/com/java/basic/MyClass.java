package com.java.basic;

public class MyClass {
	//Property
	int myInt;
	String myString;
	static int myStaticInt;
	//Constructor
	
	
	
	public MyClass() {
		this.myInt = 200;
		this.myString = "Ini adalah String Constructor";
	}
	
	//Method Overload
	public MyClass(int myInt, String myString) {
		this.myInt = myInt;
		this.myString = myString;
	}

	//Method
	void myMethod() {
		System.out.println("This my Method");
	}
	
	//Method return value double
	//Parameter x , y
	double addMethod(double x, double y) {
		return x + y;
	}
	
	static  void myStaticMethod () {
		System.out.println("Ini adalah Static Method");
	}
	

}
