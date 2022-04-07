package com.watt.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlyAlphabetReverse {

	public static void main(String[] args) {
		OnlyAlphabetReverse main = new OnlyAlphabetReverse();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(main.solution(str));
	}

	public String solution(String str) {
		String answer = "";
		String alphabet = "";
		List<Integer> intList = new ArrayList<>();
		char[] chArr = str.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			if(Character.toUpperCase(chArr[i]) < 65 || Character.toUpperCase(chArr[i]) > 90) {
				intList.add(i);
			}
			else {
				alphabet = chArr[i] + alphabet;
			}
		}
		int j = 0;
		for(int i = 0; i < chArr.length; i++) {
			if(intList.contains(i)) {
				answer += chArr[i];
			}
			else {
				answer += alphabet.toCharArray()[j++];
			}
		}
		return answer;
	}
}
