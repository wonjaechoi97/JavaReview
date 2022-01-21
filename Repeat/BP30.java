package com.ssafy.BP;

public class BP30 {
	/*
	 * #########
	 *  #######
	 *   #####
	 *    ###
	 *     #
	 */

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			for (int x=0; x<i;x++)System.out.print(" ");
			for(int j=0; j<9-2*i;j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}

	}

}
