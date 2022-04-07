package com.watt.java.dfs_bfs;

import java.util.Scanner;

public class FibonacciNumbers {

	static int[] fibo;
	
	public static void main(String[] args) {
		FibonacciNumbers main = new FibonacciNumbers();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		int[] arr = new int[n];
//		arr[0] = 1;
//		arr[1] = 1;
		
//		main.DFS(n, arr);
		
//		for(int i = 1; i <= n; i++) {
//			System.out.print(main.DFS(i) + " ");
//		}
		
		fibo = new int[n+1];
		main.DFS(n);
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
	
	public int DFS(int n) {
		if(n == 1) return fibo[n]=1;
		else if(n ==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}
	
//	public int DFS(int n) {
//		if(n == 1) return 1;
//		else if(n ==2) return 1;
//		else return DFS(n-2) + DFS(n-1);
//	}
	
	public void DFS(int n, int[] arr) {
		
		if(n == 0) return;
		else if(n == 1 || n == 2) {
			DFS(n-1, arr);
			System.out.print(1 + " ");
		}
		else {
			DFS(n-1, arr);
			arr[n-1] = arr[n-2] + arr[n-3];
			System.out.print(arr[n-1] + " ");
		}
	}

}
