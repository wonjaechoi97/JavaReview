package com.ssafy.BP;

public class BP17 {

	public static void main(String[] args) {
		int[][] arr;
		arr = new int[][] {{2,3,1,4,7},
		                   {8,13,3,33,1},
		                   {7,4,5,80,12},
		                   {17,9,11,5,4},
		                   {4,5,91,27,7}};
		int sum = 0;
		int num = 0;
		for(int[] i : arr) {
			for(int j : i) {
				if(j%3==0) {
					sum+=j;
					num++;
				}
			}
		}
		
	    System.out.println(sum+" "+num);

	}

}
