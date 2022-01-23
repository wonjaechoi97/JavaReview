package com.ssafy.BP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SW12221 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		int TC= Integer.parseInt(br.readLine());
		for(int i=1; i<=TC ;i++) {
			String S = br.readLine();
			StringTokenizer st = new StringTokenizer(S);
			
			int A= Integer.parseInt(st.nextToken());
			int B= Integer.parseInt(st.nextToken());
			
			if(A<10&&B<10) {
				bw.write("#"+i+" "+(A*B)+"\n");
			}else {
				bw.write("#"+i+" "+(-1)+"\n");
			}
		}
		br.close();
		bw.close();
		

	}

}
