package com.watt.java.array;

import java.util.Scanner;

public class VisibleStudent {

	public static void main(String[] args) {
		VisibleStudent main = new VisibleStudent();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] heights = new int[num];
		
		for(int i = 0; i < num; i++) {
			heights[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(num, heights));

	}

	public int solution(int num, int[] heights) {
		int answer = 1;
		int tallest = heights[0];
		
		for(int i = 1; i < num; i++) {
			if(heights[i] > tallest) {
				answer++;
				tallest = heights[i];
			}
		}
		
		return answer;
	}

}
