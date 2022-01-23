package com.ssafy.BP;

import java.util.Arrays;

public class BP15 {

	public static void main(String[] args) {
		char[][] chars;
		chars = new char[][] {{'C','A','A'},{'C','C','B'},{'B','A','B'},{'C','C','C'}};
		
		//for(char[] ch : chars)System.out.println(Arrays.toString(ch));
		
		for(char[] ch : chars) {
			for(char c : ch) System.out.print(c+" ");
			System.out.println();
		}
		
	}

}
