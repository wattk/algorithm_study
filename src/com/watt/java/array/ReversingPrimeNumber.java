package com.watt.java.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversingPrimeNumber {

	public static void main(String[] args) {
		ReversingPrimeNumber main = new ReversingPrimeNumber();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] array = new int[num];
		for(int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int x : main.solution(num, array)) {
			System.out.print(x + " ");
		}

	}

	public ArrayList<Integer> solution(int num, int[] array) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			int tmp = array[i];
			int res = 0;
			
			while(tmp > 0) {
				int t = tmp%10;
				res = res*10 + t;
				tmp = tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		}
		
		return answer;
		
	}

	public boolean isPrime(int res) {
		if(res == 1) return false;
		for(int i = 2; i < res; i++) {
			if(res % i == 0) return false;
		}
		return true;
	}
//	public ArrayList<Integer> solution(int num, int[] array) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		
//		for(int i = 0; i < num; i++) {
//			StringBuilder sb = new StringBuilder(String.valueOf(array[i]));
//			int prime = Integer.parseInt(sb.reverse().toString());
//			
//			if(prime == 2) {
//				answer.add(prime);
//			}
//			else if(prime == 1) {
//				continue;
//			}
//			else {
//				boolean isPrimeNumber = true;
//				for(int j = 2; j < prime; j++) {
//					if(prime % j == 0) {
//						isPrimeNumber = false;
//						break;
//					}
//				}
//				if(isPrimeNumber) answer.add(prime);
//			}
//		}
//		
//		return answer;
//	}


}
