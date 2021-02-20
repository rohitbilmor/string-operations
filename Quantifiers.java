package com.strings;

public class Quantifiers {

	public static void main(String[] args) {
		String str="acc";
		System.out.println(str.matches(".*"));
		System.out.println(str.matches("[a-z]*"));
		System.out.println(str.matches("[abcd]{3}"));
		System.out.println(str.matches("[abe]{4,9}"));
	}

}

