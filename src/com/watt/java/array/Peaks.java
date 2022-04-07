package com.watt.java.array;

import java.util.Scanner;

public class Peaks {

	public static void main(String[] args) {
		Peaks main = new Peaks();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] array = new int[num + 2][num + 2];
		
		for(int i = 1; i < num + 1; i++) {
			for(int j = 1; j < num + 1; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(main.solution(num, array));

	}

	public int solution(int num, int[][] array) {
		int answer = 0;
		
		for(int i = 1; i < num + 1; i++) {
			for(int j = 1; j < num + 1; j++) {
				if(array[i][j] > array[i][j - 1] && array[i][j] > array[i][j + 1] && array[i][j] > array[i - 1][j] && array[i][j] > array[i + 1][j]) answer++;
			}
		}
		
		return answer;
	}

}
