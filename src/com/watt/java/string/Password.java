package com.watt.java.string;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Password main = new Password();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = sc.next();
		
		System.out.println(main.solution(num, str));

	}

	public String solution(int num, String str) {
		String answer = "";
		for(int i = 0; i < str.length(); ) {
			String part = str.substring(i, i+7);
			part = part.replaceAll("[#]", "1");
			part = part.replaceAll("[*]", "0");
			int no = Integer.valueOf(part, 2);
			answer += (char)no;
			i += 7;
		}
		return answer;
	}

}
