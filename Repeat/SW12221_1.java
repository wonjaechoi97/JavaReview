package com.ssafy.BP;


import java.util.Scanner;


public class SW12221_1 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		

		int TC= sc.nextInt();
		for(int i=1; i<=TC ;i++) {
			
			int A=sc.nextInt();
			int B= sc.nextInt();
			if(A<10&&B<10) {
				System.out.print("#"+i+" "+(A*B)+"\n");
			}else {
				System.out.print("#"+i+" "+(-1)+"\n");
			}
		}
		sc.close();
		

	}

}
