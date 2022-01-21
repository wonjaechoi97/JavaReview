package com.ssafy.BP;
import java.util.Random;

public class BasicProblem23 {

	public static void main(String[] args) {
		Random rand = new Random();
		int sum = 0;
		double avg = 0;
		for(int i=0; i<100; i++) {
			int n = rand.nextInt(6)+1;
			
			sum += n;
		}
		avg=sum/100.0;
		System.out.println(sum);
		System.out.println(avg);

	}

}
