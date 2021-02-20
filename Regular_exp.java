package com.strings;

public class Regular_exp {

	public static void main(String[] args) {
		String str="1";
		String str1="abc";
		System.out.println(str.matches("."));
		System.out.println(str1.matches("ab"));
		System.out.println(str1.matches("b"));
		System.out.println(str1.matches("^a"));
		System.out.println(str.matches("1"));
		System.out.println(str.matches("A|1"));
		System.out.println(str.matches("1"));
	}

}
