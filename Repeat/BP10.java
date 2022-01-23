package com.ssafy.BP;

public class BP10 {

	public static void main(String[] args) {
		int[] intArray = {3,27,13,8,235,7,22,9,435,31,54};
		int max= Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<intArray.length;i++) {
			if(intArray[i]>max) max=intArray[i];
			if(intArray[i]<min) min=intArray[i];
		}
		
		System.out.println("최대값 : "+max+ " 최소값 : "+min);

	}

}
