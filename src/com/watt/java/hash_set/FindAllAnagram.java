package com.watt.java.hash_set;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagram {

	public static void main(String[] args) {
		FindAllAnagram main = new FindAllAnagram();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String anagram = sc.nextLine();
		
		System.out.println(main.solution(str, anagram));
	}
	
//	public int solution(String str, String anagram) {
//		int answer = 0;
//		HashMap<Character, Integer> strMap = new HashMap<>();
//		HashMap<Character, Integer> anaMap = new HashMap<>();
//		
//		for(char ch : anagram.toCharArray()) {
//			anaMap.put(ch, anaMap.getOrDefault(ch, 0)+1);
//		}
//		
//		for(int i = 0; i < anagram.length()-1; i++) {
//			strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0)+1);
//		}
//		
//		int p1 = 0;
//		for(int p2 = anagram.length()-1; p2 < str.length(); p2++) {
//			strMap.put(str.charAt(p2), strMap.getOrDefault(str.charAt(p2), 0)+1);
//			
//			if(strMap.equals(anaMap)) {
//				answer++;
//			}
//			
//			strMap.put(str.charAt(p1), strMap.get(str.charAt(p1))-1);
//			if(strMap.get(str.charAt(p1)) == 0) strMap.remove(str.charAt(p1));
//			p1++;
//		}
//		
//		
//		return answer;
//	}
	public int solution(String str, String anagram) {
		int answer = 0;
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < anagram.length()-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int p1 = 0;
		for(int p2 = anagram.length()-1; p2 < arr.length; p2++) {
			int cnt = 0;
			map.put(arr[p2], map.getOrDefault(arr[p2], 0)+1);
			for(char ch : anagram.toCharArray()) {
				System.out.println(ch + ": " + map.get(ch));
				if(map.get(ch) != 1) break;
				else cnt++;
			}
			System.out.println("cnt = " + cnt);
			if(cnt == anagram.length()) answer++;
			map.put(arr[p1], map.get(arr[p1])-1);
			p1++;
		}
		
		return answer;
	}

}
