package com.ssafy.BP;

import java.util.Random;

public class BP24 {

	public static void main(String[] args) {
		Random rand = new Random();
		int cnt = 100;
		int i = 0;
		int sum = 0;
		double avg;
		while(i<cnt) {
			int n = rand.nextInt(6)+1;
			sum+=n;
			i++;
		}
		
		avg = sum*1.0/cnt;
		System.out.printf("총 합 : %d, 평균 : %.2f \n", sum, avg);

	}

}
