package com.watt.java.sort_search;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch main = new BinarySearch();
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
		int answer = -1;
		
		Arrays.sort(arr);
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = (high + low) / 2;
			if(arr[mid] < m) low = mid+1;
			else if(arr[mid] > m) high = mid-1;
			else {
				answer = mid+1; 
				break;
			}
		}
		
		return answer;
	}
}
