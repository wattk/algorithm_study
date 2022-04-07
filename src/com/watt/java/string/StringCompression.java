package com.watt.java.string;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		StringCompression main = new StringCompression();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(main.solution(str));

	}

	public String solution(String str) {
		String answer = "";
		str += " ";
		int cnt = 1;
		for(int i = 0; i < str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}
			else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		return answer;
	}
	
//	public String solution(String str) {
//		
//		StringBuilder sb = new StringBuilder();
//		int cnt  = 1;
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			
//			if(i == str.length() - 1) {
//				if(ch == str.charAt(i - 1)) {
//					sb.append(ch);
//					sb.append(cnt);
//				}
//				else {
//					sb.append(ch);
//				}
//			}
//			else {
//				
//				if(ch == str.charAt(i + 1)) {
//					cnt++;
//				}
//				else {
//					if(cnt == 1) {
//						sb.append(ch);
//						
//					}
//					else {
//						sb.append(ch);
//						sb.append(cnt);
//						cnt = 1;
//					}
//				}
//			}
//		}
//		
//		return sb.toString();
//	}

}
