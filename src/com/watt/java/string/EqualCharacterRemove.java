package com.watt.java.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EqualCharacterRemove {

	public static void main(String[] args) {
		EqualCharacterRemove main = new EqualCharacterRemove();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(main.solution(str));
	}

	public String solution(String str) {
		String answer = "";
		Set<Character> set = new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			if(set.contains(ch)) continue;
			else {
				answer += ch;
				set.add(ch);
			}
		}
		
		return answer;
	}
}
