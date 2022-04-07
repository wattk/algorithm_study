package com.watt.java.dfs_bfs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Factorial main = new Factorial();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(main.DFS(n));
	}
	
	public int DFS(int n) {
		if(n == 1) return 1;
		else {
			return n * DFS(n-1);
		}
	}

}
