package com.watt.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public static void main(String[] args) {
		Postfix main = new Postfix();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(main.solution(str));

	}
	
	public int solution(String str) {
		Stack<Integer> stack = new Stack<>();
		int answer = 0;
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) stack.push(ch - 48);
			else {
				int b = stack.pop();
				int a = stack.pop();
				switch(ch) {
				case '+' : 
					stack.push(a + b);
					break;
				case '-' : 
					stack.push(a - b);
					break;
				case '*' : 
					stack.push(a * b);
					break;
				case '/' : 
					stack.push(a / b);
					break;
				}
			}
		}
		
		answer = stack.get(0);
		
		return answer;
	}

}
