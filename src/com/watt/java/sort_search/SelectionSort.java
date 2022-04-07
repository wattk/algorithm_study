package com.watt.java.sort_search;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		SelectionSort main = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : main.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
	
	public int[] solution(int n, int[] arr) {
		for(int i = 0; i < n-1; i++) {
			int idx = i;
			for(int j = i+1; j<n; j++) {
				if(arr[j] < arr[idx]) idx = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	}

}