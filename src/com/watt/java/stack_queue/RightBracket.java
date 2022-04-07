package com.watt.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class RightBracket {

	public static void main(String[] args) {
		RightBracket main = new RightBracket();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(main.solution(str));
	}
	
	public String solution(String str) {
		Stack<Character> stack = new Stack<>();
		String answer = "YES";
		for(char ch : str.toCharArray()) {
			if(ch == '(') stack.push('(');
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		return answer;
	}
}
