package com.java.basic;

import com.java.basic.models.Student;

public class MainClass {
	public static void main(String[] args) {
		//Object
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		MyClass obj3 = new MyClass(30, "Method dari inisialisasi contructor");
		
		Student objStudent = new Student();
		
		objStudent.setId(00001);
		objStudent.setName("Petrus");
		objStudent.setAge(25);
		
		System.out.println("Id : " + objStudent.getId());
		System.out.println("Name : " + objStudent.getName());
		System.out.println("Age : " + objStudent.getAge());
		 
		
		System.out.println("----------------------------");
		System.out.println(obj1.myInt);
		System.out.println(obj1.myString);
		obj1.myInt =10;
		obj1.myString = "Ini adalah String di method lain";
		System.out.println("----------------------------");
		System.out.println(obj1.myInt);
		System.out.println(obj1.myString);
		System.out.println("----------------------------");
		System.out.println(obj3.myInt);
		System.out.println(obj3.myString);
		System.out.println("----------------------------");
		
		
		double result = obj1.addMethod(10.0, 20.0);
		System.out.println("Hasil Penjumlahan : " +  result);
		MyClass.myStaticMethod();
		MyClass.myStaticInt =20;
		System.out.println(MyClass.myStaticInt);
	}
}
