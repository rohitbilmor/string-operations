package com.strings;

public class Remove_special_char {

	public static void main(String[] args) {
		
		String str="a!b@c#d$1%2^3&4";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]","" ));
	}

}
