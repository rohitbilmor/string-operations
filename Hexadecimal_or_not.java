package com.strings;
import java.util.Scanner;
public class Hexadecimal_or_not {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		System.out.println(str.matches("[0-9A-F]+"));

	}

}
