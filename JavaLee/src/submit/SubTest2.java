package submit;

public class SubTest2 {
	public static void main(String[] args) {
		long money = 1234567890;
		String txtMoney = Integer.toString((int) money);
		if(txtMoney.length() == 4) {
			int temp = Integer.parseInt(txtMoney);
			int a = temp/10000;
			temp %= 10000;
			System.out.println(a + "만원");
		}
	}
}
