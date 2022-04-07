package com.watt.java.sort_search;

import java.util.Arrays;
import java.util.Scanner;

public class FindingStall {

	public static void main(String[] args) {
		FindingStall main = new FindingStall();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, c, arr));
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		
		while(lt <= rt) {
			int mid = (lt + rt)/2;
			if(count(arr, mid)>=c) {
				answer = mid;
				lt = mid + 1;
			}
			else rt = mid - 1;
		}
		
		return answer;
	}
	
	public int count(int[] arr, int mid) {
		int cnt = 1;//배치한 말의 마리 수
		int ep = arr[0];//말을 배치한 좌표
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - ep >= mid) {
				cnt++;
				ep = arr[i];
			}
		}
		
		return cnt;
	}
	

}
