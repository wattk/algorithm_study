package com.watt.java.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf {

	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	
	public static void main(String[] args) {
		FindCalf main = new FindCalf();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(main.BFS(s, e));
	}
	
	public int BFS(int s, int e) {
		ch = new int[10001]; //index 번호가 10000까지 나와야 하니까
		ch[s] = 1;
		Q.offer(s);
		int L = 0; // root
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				int x = Q.poll();
				for(int j = 0; j < 3; j++) {
					int nx = x + dis[j];
					if(nx == e) return L+1;
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}

}
