package test_lee02;

public class Ex05ForStmt {

	public static void main(String[] args) {
		
		// 1~10의 합
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ 10 의 합 : " + sum);
		
		// 1~100의 합
		sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ 100 의 합 : " + sum);
		
		for(int i = 1; i<=5; i++) {
			System.out.println("*****");
		}
			
			
		// '' ==> 문자 하나 "" ==> 문자열
		// A ~ Z 출력	
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 1~100 수 중에서 3의 배수의 합
		sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i % 3 != 0) {
				continue; // 3의 배수가 아닐 때
			}
			sum = sum + i; //3의 배수의 경우
		}
		System.out.println("1~100 3의 배수의 합 : " + sum);
		
		
		// 구구단 (2~9단)
		System.out.println(">>> 구구단 출력 <<<");
		for(int dan = 2; dan <=9; dan++) {
			System.out.println("==== " + dan + "단 ====");
			for(int n = 1; n<=9; n++) {
				System.out.println(dan + " * " + n + " = " + (dan*n));
			}
		}
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
