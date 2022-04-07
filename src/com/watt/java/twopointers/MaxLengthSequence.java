package com.watt.java.twopointers;

import java.util.Scanner;

public class MaxLengthSequence {
  public static void main(String[] args){
	MaxLengthSequence main = new MaxLengthSequence();
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(main.solution(n, k, arr));
  }
  
  public int solution(int n, int k, int[] arr){
    int answer = 0;
    int p1 = 0;
    int cnt = 0;
    
    for(int p2 = 0; p2 < n; p2++) {
    	if(arr[p2] == 0) cnt++;
    	while(cnt > k) {
    		if(arr[p1] == 0) cnt--;
    		p1++;
    	}
    	answer = Math.max(answer, p2 - p1 + 1);
    }
    
    return answer;
  }
}