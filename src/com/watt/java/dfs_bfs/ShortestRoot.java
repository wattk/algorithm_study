package com.watt.java.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestRoot {

	Node root;
	
	public static void main(String[] args) {
		ShortestRoot tree = new ShortestRoot();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		System.out.println(tree.BFS(tree.root));
	}
	
	public int BFS(Node root) {
		int L = 0;
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				Node n = Q.poll();
				if(n.lt == null && n.rt == null) return L;
				Q.offer(n.lt);
				Q.offer(n.rt);
			}
			L++;
		}
		return 0;
	}

}

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}
