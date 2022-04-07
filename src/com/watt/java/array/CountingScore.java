package com.watt.java.array;

import java.util.Scanner;

public class CountingScore {

	public static void main(String[] args) {
		CountingScore main = new CountingScore();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] array = new int[num];
		for(int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(num, array));
	}
	
	public int solution(int num, int[] array) {
		int answer = 0;
		int cnt = 0;
		
		for(int i : array) {
			if(i == 0) {
				cnt = 0;
			}
			else {
				answer += ++cnt;
			}
		}
		
		return answer;
	}

}
