package com.watt.java.array;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		PrimeNumber main = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(main.solution(num));
	}

	public int solution(int num) {
		int answer = 0;
		int[] array = new int[num+1];
		for(int i = 2; i <= num; i++) {
			if(array[i] == 0) {
				answer++;
				for(int j = i; j <= num; j = j + i) {
					array[j] = 1;
				}
			}
		}
		return answer;
	}

}
