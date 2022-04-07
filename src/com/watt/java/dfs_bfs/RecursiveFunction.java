package com.watt.java.dfs_bfs;

import java.util.Scanner;

public class RecursiveFunction {

	public static void main(String[] args) {
		RecursiveFunction main = new RecursiveFunction();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		main.DFS(n);
	}
	
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
		
	}

}
