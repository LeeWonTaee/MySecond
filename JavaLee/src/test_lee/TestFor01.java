package test_lee;

public class TestFor01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
//			sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
		
		int mul = 1;
		for(int j = 1; j <= 100; j++) {
			mul *= j;
		}
		System.out.println(mul);
	}

}
