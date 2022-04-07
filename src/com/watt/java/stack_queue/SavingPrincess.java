package com.watt.java.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SavingPrincess {

	public static void main(String[] args) {
		SavingPrincess main = new SavingPrincess();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(main.solution(n, m));
	}
	
	public int solution(int n, int m) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		while(queue.size() != 1) {
			for(int i = 1; i <= m; i++) {
				int num = queue.poll();
				if(i == m) continue;
				else {
					queue.add(num);
				}
			}
		}
		answer = queue.peek();
		
		return answer;
	}

}
