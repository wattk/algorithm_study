package com.watt.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ClawCrainGame {

	public static void main(String[] args) {
		ClawCrainGame main = new ClawCrainGame();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i = 0; i < m; i++) {
			moves[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, m, board, moves));

	}
	
	public int solution(int n, int m, int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			int num = 0;
			for(int i = 0; i < n; i++) {
				if(board[i][pos-1] != 0) {
					num = board[i][pos-1];
					board[i][pos-1] = 0;
					break;
				}
			}
			
			if(!stack.isEmpty() && stack.lastElement() == num) {
				stack.pop();
				answer += 2;
			}
			else {
				stack.push(num);
			}
		}
		
		return answer;
	}

}
