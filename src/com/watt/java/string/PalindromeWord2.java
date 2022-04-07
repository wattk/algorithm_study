package com.watt.java.string;

import java.util.Scanner;

public class PalindromeWord2 {

	public static void main(String[] args) {
		PalindromeWord2 main = new PalindromeWord2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(main.solution(str));
		
	}

	public String solution(String str) {
//		str = str.toUpperCase();
//		char[] charArr = str.toCharArray();
//		String word1 = "";
//		String word2 = "";
//		
//		for(char ch : charArr) {
//			if(ch < 65 || ch > 90) {
//				str = str.replaceAll(String.valueOf(ch), "");
//			}
//		}
//		
//		word1 = str;
//		StringBuffer sb = new StringBuffer(word1);
//		word2 = sb.reverse().toString();
//		
//		System.out.println("1 = " + word1);
//		System.out.println("2 = " + word2);
//		
//		if(word1.equals(word2)) {
//			return "YES";
//		}
//		else {
//			return "NO";
//		}
		String answer = "NO";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		
		return answer;
		
	}

}
