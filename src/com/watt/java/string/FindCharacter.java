package com.watt.java.string;

import java.util.Scanner;

public class FindCharacter {
	
	public int solution(String str, char t) {
		int answer = 0;
		char[] charArr = str.toUpperCase().toCharArray();
		
		for(char ch : charArr) {
			if(ch == Character.toUpperCase(t)) answer++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		FindCharacter fc = new FindCharacter();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(fc.solution(str, c));
	}

}
