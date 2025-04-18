package com.hexa.basics;

public class Typecast {
	public static void main(String[] args) {
		byte b=100;
		int x=b*2; //upcasting
		long y=x+1000; //upcasting
		double val=y*3; //upcasting
		System.out.println(val);
// downcasting
		double num=86.2; //default double
		System.out.println(num);
		long num1=(long)num; //downcasting
		int num2=(int)num1; //downcasting
		System.out.println(num2);
		
		
	}

}