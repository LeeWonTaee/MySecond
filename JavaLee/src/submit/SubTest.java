package submit;

public class SubTest {
	public static void main(String[] args) {
		long money = 12345678;
		int temp = 0;
		int a = (int)(money/100000000);
		temp = (int)(money%100000000);
		int b = temp/10000000;
		temp = (int)(money % 10000000);
		int c = temp/1000000;
		temp = (int)(money % 1000000);
		int d = temp/100000;
		temp = (int)(money % 100000);
		int e = temp/10000;
		temp = (int)(money % 10000);
		System.out.println(a +"억"+b+"천"+c+"백"+d+"십"+e+"만원");
	}
}
