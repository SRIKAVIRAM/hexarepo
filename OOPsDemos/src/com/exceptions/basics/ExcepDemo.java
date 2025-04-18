package com.exceptions.basics;

public class ExcepDemo {
	 public static void main(String[] args) {

	        try {
	            int x = Integer.parseInt("100");
	            System.out.println(x);
	            int y = 1000 / 100;
	            System.out.println(y);
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	        System.out.println("Continue with the program");
	    }
	

}
