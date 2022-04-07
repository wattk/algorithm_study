package com.watt.java.string;

import java.util.Scanner;

public class UpperToLowerVV {

	public static void main(String[] args) {
		
		UpperToLowerVV main = new UpperToLowerVV();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(main.solution(str));

	}

	public String solution(String str) {
		String answer = "";
		char[] charArr = str.toCharArray();
		for(char ch : charArr) {
			if(ch > 64 && ch <= 90) {
				ch = Character.toLowerCase(ch);
			}
			else if(ch > 96 && ch <= 122) {
				ch = Character.toUpperCase(ch);
			}
			
			answer += ch;
		}
		
		
		return answer;
	}

}
