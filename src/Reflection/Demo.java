package Reflection;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Test {
	//Creating a field
	private String s; 
	
	// creating a constructor
	public Test(){
		s= "Reflection";
	}
	// Creating methods
	public void method1(){
		System.out.println("The string is :"+s);
	}
	public void method2(int n){
		System.out.println("The number is: "+n);
	}
	private void method3(){
		System.out.println("Private method is invoked");
	}
}
