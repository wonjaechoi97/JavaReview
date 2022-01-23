package com.ssafy.BP;

public class BP7n8 {

	public static void main(String[] args) {
		String[] names = {"홍길동","임꺽정","장길산","이몽룡"};
		
		for(String S : names) {
			System.out.println(S);
		}
		System.out.println();
		//////// BP 8
		
		String x="";
		x=names[1];
		names[1]=names[2];
		names[2]=x;
		
		for(String S : names) {
			System.out.println(S);
		}

	}

}
