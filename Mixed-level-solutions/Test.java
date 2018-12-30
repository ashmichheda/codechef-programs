package com.prog.CodeChefPrograms;

public class Test {

	private int i = 10;
	public void test() {
		System.out.println("Inside parent class");
	}
	
	public static void main(String[] args) {
		
		Test t = new Sample();
		t.test();
		System.out.println("Value of i: "+t.i);
	}

}

class Sample extends Test{
	
	public void test() {
		super.test();
		System.out.println("Inside child class");
	}
	
	
}
