package com.watt.java.string;

import java.util.Scanner;

public class PalindromeWord1 {

	public static void main(String[] args) {
		PalindromeWord1 main = new PalindromeWord1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		System.out.println(main.solution(str));

	}

	public String solution(String str) {
		
		String s1 = "";
		String s2 = "";
		
		if(str.length() % 2 == 0) {
			s1 = str.substring(0, str.length()/2);
			s2 = str.substring(str.length()/2);
		}
		else {
			s1 = str.substring(0, str.length()/2);
			s2 = str.substring(str.length()/2 + 1);
		}
		StringBuffer sb = new StringBuffer(s2);
		s2 = sb.reverse().toString();
		
		if(!s1.toUpperCase().equals(s2.toUpperCase())) {
			return "NO";
		}
		else {
			return "YES";
		}
	}

}
