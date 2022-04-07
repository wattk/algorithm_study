package com.watt.java.stack_queue;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyRoom {

	public static void main(String[] args) {
		EmergencyRoom main = new EmergencyRoom();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(main.solution(n, m, arr));
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 1;
		Queue<Person> queue = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			queue.add(new Person(i, arr[i]));
		}
		
		while(!queue.isEmpty()) {
			Person person = queue.poll();
			for(Person p : queue) {
				if(p.priority > person.priority) {
					queue.add(person);
					person = null;
					break;
				}
			}
			if(person != null) {
				if(person.index == m) return answer;
				else answer++;
			}
		}
		
		return answer;
		
	}
	
	public class Person {
		int index;
		int priority;
		public Person(int index, int priority) {
			super();
			this.index = index;
			this.priority = priority;
		}
	}
	

}
