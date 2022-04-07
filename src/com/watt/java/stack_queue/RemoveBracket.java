package com.watt.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracket {

	public static void main(String[] args) {
		RemoveBracket main = new RemoveBracket();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(main.solution(str));

	}
	
	public String solution(String str) {
		Stack<Character> stack = new Stack<>();
		String answer = "";
		for(char ch : str.toCharArray()) {
			if(ch == '(') stack.push(ch);
			else if(ch == ')') stack.pop();
			else {
				if(stack.isEmpty()) answer += ch;
			}
		}
		
		return answer;
	}

}
