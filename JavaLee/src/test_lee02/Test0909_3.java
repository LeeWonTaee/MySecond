package test_lee02;

import java.util.Scanner;

public class Test0909_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		 
		int aa[][] = new int[3][4];

		for(int i=0; i<3; i++) {
			System.out.println();
			System.out.println(" -------------------------------");
			for(int j=0; j<4; j++) {
			aa[i][j] = (int)(Math.random()*100)+1;
			System.out.print("|   " + aa[i][j] +"\t");			
			}
			System.out.print("|   ");
		}
		System.out.println();
		System.out.println(" -------------------------------");
		

		sc.close();

	}

}
