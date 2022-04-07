package com.watt.java.stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

	public static void main(String[] args) {
		IronStick main = new IronStick();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(main.solution(str));
	}
	
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '(') stack.push('(');
			else {
				if(i != 0 && arr[i-1] == '(') {
					stack.pop();
					answer += stack.size();
				}
				else {
					stack.pop();
					answer++;
				}
			}
		}
		
		return answer;
	}

}
