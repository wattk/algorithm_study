package com.watt.java.hash_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalesCategory {

	public static void main(String[] args) {
		SalesCategory main = new SalesCategory();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : main.solution(n, m, arr)) {
			System.out.print(x + " ");
		}
	}
	
//	public ArrayList<Integer> solution(int n, int m, int[] arr) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(int i = 0; i <= n-m; i++) {
//			for(int j = i; j <= i+m-1; j++) {
//				if(j != 0) map.remove(arr[j-1]);
//				map.put(arr[j], arr[j]);
//			}
//			answer.add(map.size());
//		}
//		return answer;
//	}
	public ArrayList<Integer> solution(int n, int m, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < m-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int p1 = 0;
		for(int p2 = m-1; p2 < n; p2++) {
			map.put(arr[p2], map.getOrDefault(arr[p2], 0)+1);
			answer.add(map.size());
			map.put(arr[p1], map.get(arr[p1])-1);
			if(map.get(arr[p1])==0) map.remove(arr[p1]);
			p1++;
		}
		
		return answer;
	}

}
