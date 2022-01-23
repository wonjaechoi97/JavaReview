package com.ssafy.BP;

public class BP20 {
	static int[] di= {-1, 0, 1, 0};
	static int[] dj= {0, 1, 0, -1};

	public static void main(String[] args) {
		char[][] arr= {{'2','3','1','4'},
		                {'1','x','3','2'},
		                {'3','4','x','x'},
		                {'x','4','1','5'}};
		
		//3 1 3 4   1   2 5    3 4
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[i][j]=='x') {
					for(int x=0; x<di.length;x++) {
						int ni= i+di[x];
						int nj=j+dj[x];
						if(ni>=0&&ni<arr.length&&nj>=0&&nj<arr.length&&arr[ni][nj]!='x') {
							//System.out.println(arr[ni][nj]);
							sum+=arr[ni][nj]-'0';
							arr[ni][nj]='0';
						}
					}
				}
				
			}
		}
		System.out.println("총합 : "+sum);
		
		

	}

}
