package com.watt.java.twopointers;

import java.util.Scanner;

public class ConsecutiveNumberSubSequence {

	public static void main(String[] args) {
		ConsecutiveNumberSubSequence main = new ConsecutiveNumberSubSequence();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, m, arr));
	}

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int p1 = 0, p2 = 1;
		int sum = arr[p1];

		while(p2 < n) {
			if(sum == m) {
				answer++;
				sum -= arr[p1++];
			}
			else if(sum > m) {
				sum -= arr[p1++];
			}
			else {
				sum += arr[p2++];
				if(p2 == n && sum == m) answer++;
			}
		}
		
		return answer;
	}

//	public int solution(int n, int m, int[] arr) {
//		int answer = 0;
//		int p1 = 0;
//		int sum = 0;
//		
//		for(int p2 = 0; p2 < n; p2++) {
//			sum += arr[p2];
//			if(sum == m) answer++;
//			while(sum >= m) {
//				sum -= arr[p1++];
//				if(sum == m) answer++;
//			}
//		}
//		
//		return answer;
//	}

}
