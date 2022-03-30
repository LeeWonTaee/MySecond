package submit.submit_0107;

public class Submit03 {
	public static void main(String[] args) {
		String info = "홍길동, 010-1234-5678, hong1@test.com";
		String[] infoArr = info.split(", ");
		System.out.println("=================================");
		System.out.println("이름\t :  " + infoArr[0]);
		System.out.println("연락처\t :  " + infoArr[1]);
		System.out.println("이메일\t :  " + infoArr[2]);
		System.out.println("=================================");
	}
	
//	public static void makeInfo(String name, String phone, String email) {
//		System.out.println("==========================");
//		System.out.println("이름\t : " + name);
//		System.out.println("연락처\t : " + phone);
//		System.out.println("이메일\t : " + email);
//		System.out.println("==========================");
//	}
}
