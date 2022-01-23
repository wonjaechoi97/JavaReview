package com.ssafy.BP;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Palbang {

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("res/input.txt"));
		Scanner sc = new Scanner(System.in);
		int[] di = {-1,-1,0,1,1,1,0,-1};
		int[] dj = {0,1,1,1,0,-1,-1,-1};	
		int T = sc.nextInt();
		
		for(int t = 0;t<T; t++) {
			int N = sc.nextInt();
			char[][] build = new char[N][N];
			for(int i = 0; i<N;i++) {
				for(int j=0; j<N;j++) {
					build[i][j]= sc.next().charAt(0);
				}
			}
			//for(char[] ch : build) System.out.println(Arrays.toString(ch));
			int max =2;
			for(int i = 0; i<N; i++) {
				for(int j=0; j<N;j++) {
					int po = 0;
					int sum=0;
					if(build[i][j]=='B') {
						for(int x = 0; x<dj.length;x++) {
							for(int y=0; y<di.length;y++) {
								int ni = i+di[x];
								int nj= j+ dj[y];
								
								
								if(ni>=0&&ni<N&&nj>=0&&nj<N) {
									if(build[ni][nj]=='G')po=1;
								}
							}
						}
						if(po==0) {
						for(int y=0; y<N; y++) {
							if(build[i][y]=='B')sum++;
							if(build[y][j]=='B')sum++;
						}
						if(sum-1>max) max = sum-1;
						}
					}
				}
			}
				
			System.out.println("#"+t+" "+max);
		}
		

	}

}
