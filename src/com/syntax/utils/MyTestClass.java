package com.syntax.utils;

public class MyTestClass extends MyBaseClass {
	
	public static void main(String[] args) {
		
		setUp();
		String title=driver.getTitle();
		System.out.println(title);
		
		tearDown();
	}

}
