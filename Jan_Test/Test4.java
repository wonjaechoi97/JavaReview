/*
Test4.java : 팀원 평균

[테스트케이스]

5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(new File("Test4.txt"));

		int testcase = in.nextInt();
		for (int i = 0; i < testcase; i++) {
			// 구현 하세요
			int sum = 0;
			int stu=0;			
			double avg=0;
			
			int N = in.nextInt();
			double[] scores= new double[N];
			for(int j=0;j<N;j++) {
				scores[j]=in.nextInt();
				sum +=scores[j];
				
			}
			avg = (1.0*sum)/N;
			
			for(int j=0; j<N;j++) {
				if(scores[j]>avg) stu++;
			}
			double per = (stu*100.0)/N;
			
			
			System.out.printf("#%d %.3f",i+1,per);
			System.out.println("%");


		}
		in.close();
	}
}
