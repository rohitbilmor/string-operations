package com.strings;

public class Gmail_U_D {

	public static void main(String[] args) {
		String str="johnWick123@gmail.com";
		int i=str.indexOf("@");
		String uname=str.substring(0,i);
		String domain=str.substring(i+1,str.length());
		
		System.out.println("Username : "  +uname);
		System.out.println("Domain :"+domain);

	}

}

