package com.watt.java.hash_set;

import java.util.HashMap;
import java.util.Scanner;

public class ClassLeader {

	public static void main(String[] args) {
		ClassLeader main = new ClassLeader();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		
		System.out.println(main.solution(num, str));
	}

	public char solution(int num, String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		char answer = ' ';
//		map.put('A', 0);
//		map.put('B', 0);
//		map.put('C', 0);
//		map.put('D', 0);
//		map.put('E', 0);
		
		for(char ch : str.toCharArray()) {
//			map.put(ch, map.get(ch)+1);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}

}
