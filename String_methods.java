package com.strings;
public class String_methods {

	public static void main(String[] args) {
		String str="HelloWorld";
		String str_="   HelloWorld   ";   
		int l=str.length();
		String str1=str.toLowerCase();
		String str2=str.toUpperCase();
		String str3=str_.trim();
		String str4=str.substring(3);
		String str5=str.substring(3,5);
		String str6=str.replace('l','k');
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);

	}

}
