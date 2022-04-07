package com.watt.java.array;

import java.util.Scanner;

public class TemporaryLeader {

public static final int GRADE = 5;
	
	public static void main(String[] args) {
		
		TemporaryLeader main = new TemporaryLeader();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] array = new int[num+1][GRADE+1];
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= GRADE; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(main.solution(num, array));
	}

	public int solution(int num, int[][] array) {
		int answer = 0;
		int max = 0;
		
		for(int i = 1; i <= num; i++) {
			int cnt = 0;
			for(int j = 1; j <= num; j++) {
				for(int k = 1; k <= GRADE; k++) {
					if(array[i][k] == array[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		
		return answer;
	}

}
