package test_lee;

public class TestFor03 {
	public static void main(String[] args) {
		// 구구단 (2~9단)
		
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		// 1부터 100까지 3의 배수의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지 3의 배수의 합 : " + sum);
		
		// 별찍기
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}	
