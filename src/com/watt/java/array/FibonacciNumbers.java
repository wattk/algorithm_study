package com.watt.java.array;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		FibonacciNumbers main = new FibonacciNumbers();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i : main.solution(num)) {
			System.out.print(i + " ");
		};

	}

	public int[] solution(int num) {
		int[] answer = new int[num];
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < num; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		
		return answer;
	}

}
