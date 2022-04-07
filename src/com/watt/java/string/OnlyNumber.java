package com.watt.java.string;

import java.util.Scanner;

public class OnlyNumber {

	public static void main(String[] args) {
		OnlyNumber main = new OnlyNumber();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(main.solution(str));

	}
	
	public int solution(String str) {
		
		str = str.replaceAll("[^0-9]", "");
		System.out.println(str);
		int answer = Integer.parseInt(str);
		
		return answer;
	}

}
