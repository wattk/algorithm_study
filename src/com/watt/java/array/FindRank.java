package com.watt.java.array;

import java.util.Scanner;

public class FindRank {

	public static void main(String[] args) {
		FindRank main = new FindRank();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] array = new int[num];
		
		for(int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int j : main.solution(num, array)) {
			System.out.print(j + " ");
		}

	}
	
	public int[] solution(int num, int[] array) {
		int[] answer = new int[num];
		
		for(int i = 0; i < num; i++) {
			int cnt = 1;
			for(int j = 0; j < num; j++) {
				if(array[i] < array[j]) {
					cnt++;
				}
			}
			answer[i] = cnt;
		}
		
		return answer;
	}

}
