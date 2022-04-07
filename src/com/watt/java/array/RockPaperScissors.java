package com.watt.java.array;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		RockPaperScissors main = new RockPaperScissors();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] player1 = new int[num];
		int[] player2 = new int[num];
		
		for(int i = 0; i< num; i++) {
			player1[i] = sc.nextInt();
		}
		for(int i = 0; i< num; i++) {
			player2[i] = sc.nextInt();
		}
		
		for(char ch : main.solution(num, player1, player2)) {
			System.out.println(ch);
		}
		
	}

	public char[] solution(int num, int[] player1, int[] player2) {
		char[] answer = new char[num];
		for(int i = 0; i < num; i++) {
			if(player1[i] == player2[i]) answer[i] = 'D';
			else if(player1[i] == 1) answer[i] = (player2[i] == 2)? answer[i] = 'B' : 'A';
			else if(player1[i] == 2) answer[i] = (player2[i] == 3)? answer[i] = 'B' : 'A';
			else if(player1[i] == 3) answer[i] = (player2[i] == 1)? answer[i] = 'B' : 'A';
		}
		return answer;
	}

}
