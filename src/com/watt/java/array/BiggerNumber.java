package com.watt.java.array;

import java.util.ArrayList;
import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		BiggerNumber main = new BiggerNumber();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : main.solution(num, arr)) {
			System.out.print(x + " ");
		}

	}

	public ArrayList<Integer> solution(int num, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i = 1; i < num; i++) {
			 if(arr[i] > arr[i-1]) answer.add(arr[i]);
		}
		
		return answer;
	}

}
