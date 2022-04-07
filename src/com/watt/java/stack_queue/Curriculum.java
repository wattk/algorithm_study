package com.watt.java.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {

	public static void main(String[] args) {
		Curriculum main = new Curriculum();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String curri = sc.next();
		
		System.out.println(main.solution(s, curri));
	}
	
	public String solution(String s, String curri) {
		String answer = "NO";
		Queue<Character> queue = new LinkedList<>();
		for(char ch : s.toCharArray()) {
			queue.add(ch);
		}
		
		for(char ch : curri.toCharArray()) {
			if(queue.isEmpty()) return "YES";
			else {
				char c = queue.peek();
				if(ch == c) queue.poll();
			}
		}
		
		return answer;
	}

}
