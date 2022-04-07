package com.watt.java.dfs_bfs;

import java.util.Scanner;

public class BinaryNum {

	public static void main(String[] args) {
		BinaryNum main = new BinaryNum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		main.DFS(n);
	}
	
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n/2);
			System.out.print(n % 2);
		}
	}

}
