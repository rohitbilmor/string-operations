package com.strings;

public class String_method {

	public static void main(String[] args) {
		String str="www.abcd.org";
		boolean str1=str.startsWith("www");
		boolean str2=str.startsWith("abcd");
		char str3=str.charAt(5);
		int str4=str.indexOf("a");
		int str5=str.lastIndexOf(".");
		int str6=str.indexOf(".");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		

	}

}
