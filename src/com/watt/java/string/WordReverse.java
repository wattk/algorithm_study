package com.watt.java.string;

import java.util.Scanner;
import java.util.Stack;

public class WordReverse {

	public static void main(String[] args) {
		WordReverse main = new WordReverse();
		Scanner sc = new Scanner(System.in);
		String[] strArr = null;

		while(true) {
			int num = sc.nextInt();
			
			if(num < 3 || num > 20) {
				System.out.println("잘못된 수를 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			
			strArr = new String[num];
			
			for(int i = 0; i < num; i++) {
				String str = sc.next();
				char[] chArr = str.toCharArray();
				for(char ch : chArr) {
					char alphabet = Character.toUpperCase(ch);
					if( alphabet <  65 || alphabet > 90) {
						System.out.println("알파벳이 아닙니다. 다시 입력하세요.");
						continue;
					}
				}
				strArr[i] = str;
			}
			break;
		}
		main.solution(strArr);
	}

	public void solution(String[] strArr) {
		for(int i = 0; i < strArr.length; i++) {
			String answer = "";
			for(int j = 0; j < strArr[i].length(); j++) {
				char ch = strArr[i].charAt(strArr[i].length() - j - 1);
				answer += ch;
			}
			System.out.println(answer);
		}
	}

}
