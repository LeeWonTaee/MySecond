package test_lee02;

import java.util.Scanner;

public class Test0909_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		 
		int aa[][] = new int[3][];
		aa[0] = new int[4];
		aa[1] = new int[2];
		aa[2] = new int[3];
		
		for(int i=0; i<aa.length; i++) {
			System.out.println();
			for(int j=0; j<aa[i].length; j++) {
			aa[i][j] = (int)(Math.random()*100)+1;
			System.out.print(aa[i][j] +"\t");			
			}
		}

		

				
		sc.close();

	}

}
