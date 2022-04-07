package com.watt.java.string;

import java.util.Scanner;

public class TheShortestLength {

	public static void main(String[] args) {
		TheShortestLength main = new TheShortestLength();
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next ();
		char t = sc.next().charAt(0);

		for(int x : main.solution(s, t)) {
			System.out.print(x + " ");
		}

	}
	
//	public int[] solution(String s, char t) {
//		int[] answer = new int[s.length()];
//		
//		int p = 1000;
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == t) {
//				p = 0;
//				answer[i] = p;
//			}
//			else {
//				p++;
//				answer[i] = p;
//			}
//		}
//		
//		p = 1000;
//		
//		for(int i = s.length() - 1; i >= 0; i--) {
//			if(s.charAt(i) == t) {
//				p = 0;
//			}
//			else {
//				p++;
//				answer[i] = Math.min(answer[i], p);
//			}
//		}
//		
//		return answer;
//	}
	
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(t == ch) {
				answer[i] = 0;;
				continue;
			}
			
			String str1 = new StringBuffer(s.substring(0, i+1)).reverse().toString();
			String str2 = s.substring(i+1);
			
			int index1 = str1.indexOf(String.valueOf(t));
			int index2 = str2.indexOf(String.valueOf(t));
			
			if(index1 < 0) answer[i] = index2 + 1;
			else if(index2 < 0) answer[i] = index1;
			else {
				answer[i] = (index1 < index2 + 1 ? index1 : index2 + 1);
			}
		}
		
		return answer;
	}

}
