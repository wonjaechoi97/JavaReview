package com.ssafy.BP;

import java.util.Scanner;

public class Alphabet1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		char A = 'A';
		
		for(int i=1; i<2*N;i++) {
			if(i<=N) {
				for(int j = 1 ; j<=N-i;j++) {
					System.out.print("  ");
				}
				for(int k=1;k<2*i;k++) {
					System.out.print(A++ +" ");
				}
				System.out.println();
			}else {
				for(int j=1; j<=i-N;j++) {
					System.out.print("  ");
				}
				for(int k=1;k<2*N-(i-N)*2;k++) {
					System.out.print(A++ +" ");
				}
				System.out.println();
			}
		}
		

	}

}
