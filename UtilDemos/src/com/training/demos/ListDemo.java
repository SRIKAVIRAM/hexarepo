package com.training.demos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List fruits =new ArrayList();
		fruits.add("apple");
		fruits.add("cherry");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("1");
		System.out.println(fruits);
		for (Object fruit:fruits) {
			String fr=(String)fruit;
			System.out.println(fr.toUpperCase());
		}
	}

}
