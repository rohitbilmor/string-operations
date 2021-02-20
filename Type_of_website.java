package com.strings;
import java.util.Scanner;
public class Type_of_website {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter the URL");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		String str1=str.substring(0,str.indexOf(":"));
		if(str1.equals("http"))
		{
			System.out.println("Hyper Text Transfer Protocol");
		
		}
		else if(str1.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
		else if(str1.equals("tcp"))
		{
			System.out.println("Transmission Control Protocol");
		}
		else if(str1.equals("https"))
		{
			System.out.println("Hyper Text Transfer Protocol Secure");
		}
		else if(str1.equals("smtp"))
		{
			System.out.println("Simple Mail Transfer Protocol");
		}
		
		String ext=str.substring(str.lastIndexOf(".")+1);
		if(ext.equals("com"))
		{
			System.out.println("commercial");
		}
		else if(ext.equals("gov"))
		{
			System.out.println("Government");
		}
		else if(ext.equals("net"))
		{
			System.out.println("Network");
		}
	}

}
