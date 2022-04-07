package com.watt.java.sort_search;

import java.util.Scanner;

public class LeastRecentlyUsed {

	public static void main(String[] args) {
		LeastRecentlyUsed main = new LeastRecentlyUsed();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : main.solution(s,n,arr)) System.out.print(x + " ");
	}
	
	public int[] solution(int s, int n, int[] arr) {
		int[] answer = new int[s];
		for(int i = 0; i < n; i++) {
			int pos = -1;
			for(int j = 0; j < s; j++) {
				if(arr[i] == answer[j]) pos = j;
			}
			if(pos == -1) {
				for(int t = s-1; t>=1; t--) {
					answer[t] = answer[t-1];
				}
			}
			else {
				for(int t = pos; t>=1; t--) {
					answer[t] = answer[t-1];
				}
			}
			answer[0] = arr[i];
		}
		return answer;
		
	}

}
