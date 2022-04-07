package com.watt.java.hash_set;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class TheKNum {

	public static void main(String[] args) {
		TheKNum main = new TheKNum();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, k , arr));
	}
	
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());//기본 오름차순인 TreeSet을 내림차순으로 변환
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					set.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt = 0;
		for(int x : set) {
			cnt++;
			if(cnt == k) return x;
		}
		
		return answer;
	}

}
