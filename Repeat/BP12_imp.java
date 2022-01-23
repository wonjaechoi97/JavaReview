package com.ssafy.BP;

import java.util.Arrays;

public class BP12_imp {

	public static void main(String[] args) {
		int[] intArray= {3,7,2,5,7,7,9,2,8,1,1,5,3};
		int[] used = new int[10];
		
		for(int i : intArray) used[i]++;
		
		for(int i : used) System.out.print(i+" ");

	}

}
