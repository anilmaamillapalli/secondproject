package com.makiam.java.test;

public class HelloWorld {
	public static void main(String[] args){
		System.out.println("this is my first project");
		HelloWorld hw= new HelloWorld();
		System.out.println(hw.getNameCon());
		//System.out.println(getName());
	}
	private   String getName(String s){
		return "@gmail.com";
	}

	public   String getNameCon(){
		String s=getName("hello");
		return "anilkumar"+s;
	}
	
}
