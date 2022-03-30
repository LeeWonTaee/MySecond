package test_lee;

public class TestEtc {
	public static void main(String[] args) {
		/* Math.random() : 0~1(1은 포함하지 않는다.) 구간의 부동소수점의 난수를 생성하는 함수 */
		double a = Math.random(); 
		System.out.println(a);

		/* Math.floor() : 소숫점 첫째자리를 버리는 함수 */
		double b = Math.floor(Math.random()); 
		System.out.println(b);

		double c = Math.floor(Math.random() * 10); // 0 <= c <= 9
		System.out.println(c);

		double d = Math.floor(Math.random() * 100); // 0 <= d <= 99
		System.out.println(d);

		double e = Math.floor(Math.random() * 51); // 0 <= e <= 50
		System.out.println(e);

		double f = Math.floor(Math.random() * 51) + 1; // 1 <= f <= 51
		System.out.println(f);
	}

}
