package com.strings;
import java.util.Scanner;
public class Binary_or_not {

	public static void main(String[] args) {
		int b;
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		String str=b+""; //converts integer to string
		System.out.println(str.matches("[01]+"));
			}

}
