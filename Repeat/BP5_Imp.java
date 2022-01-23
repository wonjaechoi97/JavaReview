package com.ssafy.BP;

public class BP5_Imp {

	public static void main(String[] args) {
		String numbers = "1234567890";
		int sum = 0;
		for(int i=0; i<numbers.length();i++) {
			sum+=numbers.charAt(i)-'0';
		}
		System.out.println(sum);
		
			}

}
