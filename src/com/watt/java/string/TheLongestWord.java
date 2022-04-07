package com.watt.java.string;

import java.util.Scanner;

public class TheLongestWord {

	public static void main(String[] args) {
		TheLongestWord main = new TheLongestWord();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(main.solution(str));
	}

	public String solution(String str) {
		String word = "";
		int length = 0;
		String[] strArr = str.split(" ");
		
		for(String s : strArr) {
			if(s.length() > length) {
				length = s.length();
				word = s;
			}
		}
		return word;
	}
}
