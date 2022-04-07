package com.watt.java.array;

import java.util.Scanner;

public class TheBiggestSum {

	public static void main(String[] args) {
		TheBiggestSum main = new TheBiggestSum();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[][] array = new int[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				array[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println(main.solution(num, array));

	}

	public int solution(int num, int[][] array) {
		int answer = 0;
		int cross1 = 0;
		int cross2 = 0;
		
		for(int i = 0; i < num; i++) {
			
			int sum1 = 0;
			int sum2 = 0;
			
			cross1 += array[i][i];
			cross2 += array[i][num - i - 1];
			
			for(int j = 0; j < num; j++) {
				sum1 += array[i][j];
				sum2 += array[j][i];
			}
			
			if(sum1 > answer && sum1 > sum2) answer = sum1;
			else if(sum2 > answer && sum2 > sum1) answer = sum2;
		}
		
		if(cross1 > answer && cross1 > cross2) answer = cross1;
		else if(cross2 > answer && cross2 > cross1) answer = cross2;
		
		return answer;
	}

}
