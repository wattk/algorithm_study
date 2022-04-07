package com.watt.java.hash_set;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Anagram main = new Anagram();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(main.solution(str1, str2));
	}

	public String solution(String str1, String str2) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map.values());
		
		for(char ch : str2.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)-1);
			}
		}
		System.out.println(map.values());
		
		
		boolean isRight = true;
		
		for(char ch : map.keySet()) {
			System.out.println(isRight);
			if(map.get(ch) != 0) {
				isRight = false;
				break;
			}
		}
		
		if(isRight) return "YES";
		else return "NO";
	}

}
