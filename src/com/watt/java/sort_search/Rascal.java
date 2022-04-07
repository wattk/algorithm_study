package com.watt.java.sort_search;

import java.util.Arrays;
import java.util.Scanner;

public class Rascal {
	public static void main(String[] args) {
		Rascal main = new Rascal();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : main.solution(n, arr)) System.out.print(x + " ");
	}
	
	public int[] solution(int n, int[] arr) {
		
		int[] answer = new int[2];
		int[] copyArr = arr.clone();
		Arrays.sort(copyArr);
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != copyArr[i]) {
				answer[0] = i+1;
				for(int j = i+1; j < n; j++) {
					if(arr[j] != copyArr[j]) {
						answer[1] = j+1;
						return answer;
					}
				}
				
			}
		}
		
		return answer;
	}
	
}
