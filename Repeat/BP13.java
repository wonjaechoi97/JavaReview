package com.ssafy.BP;

import java.util.Arrays;

public class BP13 {

	public static void main(String[] args) {
		int[] intArray = {1,3,4,7,8,10,12,15,16,17,18};
		int[] used = new int[20];
		for(int i =0; i<intArray.length;i++) {
			used[intArray[i]-1]++;
		}
		
		for(int i =0; i<used.length;i++){
			if(used[i] == 0) System.out.print((i+1)+" ");
			
		}
	}

}
