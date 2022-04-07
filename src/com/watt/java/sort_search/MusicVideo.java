package com.watt.java.sort_search;

import java.util.*;

public class MusicVideo {

	public static void main(String[] args) {
		MusicVideo main = new MusicVideo();
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
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr, mid)<= m) {
				answer = mid;
				rt = mid - 1;
			}
			else lt = mid + 1;
		}
		
		return answer;
	}
	
	public int count(int[] arr, int capacity) {
		int cnt = 1;
		int sum = 0;
		
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			}
			else sum += x;
		}
		
		return cnt;
	}
}
