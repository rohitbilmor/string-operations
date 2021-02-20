package com.strings;

public class Meta_char {

	public static void main(String[] args) {
		String str="1";
		String str1="A";
		String str2=" ";
		String str3="$";
		System.out.println(str.matches("\\d"));
		System.out.println(str.matches("\\D"));
		System.out.println(str2.matches("\\s"));
		System.out.println(str2.matches("\\S"));
		System.out.println(str1.matches("\\w"));
		System.out.println(str3.matches("\\W"));

	}

}
