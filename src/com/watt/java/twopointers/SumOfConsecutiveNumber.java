package com.watt.java.twopointers;

import java.util.*;

public class SumOfConsecutiveNumber {
  public static void main(String[] args){
	SumOfConsecutiveNumber main = new SumOfConsecutiveNumber();
    Scanner sc=new Scanner(System.in);
    
    int num = sc.nextInt();
    System.out.println(main.solution(num));
  }
  
  public int solution(int num){
    int p1 = 1;
    int answer = 0;
    int sum = p1;
    for(int p2 = 2; p2 <= num/2 +1 ; p2++){
      if(p1 == p2) continue;
      sum += p2;
      if(sum == num){
    	  System.out.println("같다!");
        answer++;
        sum -= p1++;
      }
      while(sum >= num){
    	  System.out.println("크다!");
        sum -= p1++;
        if(sum == num) answer++;
      }
      System.out.println("p1 = " + p1 + ", p2 = " + p2);
    }
    return answer;
  }
}