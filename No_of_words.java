package com.strings;


public class No_of_words {

	public static void main(String[] args) {
		String str="   abc    cdef    gh   ijklm    ";
		str=str.replaceAll("\\s+"," ").trim();
		String words[]=str.split("\\s");
		System.out.println(words.length);

	}

}
