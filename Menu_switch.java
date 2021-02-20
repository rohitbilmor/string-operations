package com.strings;
import java.util.Scanner;
public class Menu_switch {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sc.nextLine();
		String str;
		System.out.println("Enter operation in capital words");
		str=sc.next();
		str=str.toUpperCase();
		switch(str)
		{
			case "ADD":System.out.println(a+b);
			break;
			case "SUB":System.out.println(a-b);
			break;
			case "MUL":System.out.println(a*b);
			break;
			case "DIV":System.out.println(a/b);
			break;
		default:System.out.println("error input");
		}
	
	}

}
