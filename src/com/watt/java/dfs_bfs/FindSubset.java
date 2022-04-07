package com.watt.java.dfs_bfs;

import java.util.Scanner;

public class FindSubset {
	static int[] ch;
	static int n;

	public static void main(String[] args) {
		FindSubset main = new FindSubset();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ch = new int[n+1];
		
		main.DFS(1);
	}
	
	public void DFS(int L) {
		if(L == n+1) {
			String tmp = "";
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) tmp += i + " ";
			}
			if(tmp.length() > 0) System.out.println(tmp);
		}
		else {
			ch[L] = 1;//사용한다.
			DFS(L+1);//왼
			
			ch[L] = 0;//사용하지 않는다.
			DFS(L+1);//오
		}
	}

}
