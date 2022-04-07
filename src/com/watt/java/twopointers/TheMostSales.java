package com.watt.java.twopointers;

import java.util.Scanner;

public class TheMostSales {

	public static void main(String[] args) {
		TheMostSales main = new TheMostSales();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, k, arr));

	}

//	public int solution(int n, int k, int[] arr) {
//		int answer = 0;
//
//		for(int i = 0; i < n - k; i++) {
//			int sum = 0;
//			for(int j = i; j < i + k; j++) {
//				sum += arr[j];
//			}
//			if(answer < sum) answer = sum;
//		}
//		
//		return answer;
//	}
	
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int sum = 0;
		for(int i = 0; i < k; i++) {
			sum += arr[i];
		}
		answer = sum;
		
		for(int j = k; j < n; j++) {
			sum = sum + arr[j] - arr[j-k];
//			if(answer < sum) answer = sum;
			answer = Math.max(answer, sum);
		}
		
		
		return answer;
	}

}
