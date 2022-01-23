package com.ssafy.BP;

public class BP11_imp {

	public static void main(String[] args) {
		int[] intArray = {3,27,13,8,235,7,22,9,435,31,54};
		int sum=0;
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		int min_index =0;
		int max_index = 0;
	
		double avg=0;
		
		for(int i=0; i<intArray.length;i++){
			sum+=intArray[i];
		}
		avg = sum*1.0/intArray.length;
		
		for(int i=0; i<intArray.length;i++) {
			if(Math.abs(intArray[i]-avg)<min) {
				min = Math.abs(intArray[i]-avg);
				min_index=i;
				
				}
			if(Math.abs(intArray[i]-avg)>max) {
				max = Math.abs(intArray[i]-avg);
				max_index=i;
				
				}
			}
		
		
		System.out.printf("평균 : %.2f\n평균과 차이가 가장 큰 값 : %d\n평균과 차이가 가장 작은 값 : %d",avg, 
				intArray[max_index], intArray[min_index]);
		}
			

	

}
