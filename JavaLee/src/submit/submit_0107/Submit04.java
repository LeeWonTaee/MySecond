package submit.submit_0107;

import java.util.Scanner;

public class Submit04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 신장(cm)을 입력해주세요 : ");
		String myCm = sc.nextLine();
		System.out.print("현재 체중(kg)을 입력해주세요 : ");
		String myKg = sc.nextLine();
		
		int myCmInfo = Integer.parseInt(myCm);
		int myKgInfo = Integer.parseInt(myKg);
		
		double kg = (myCmInfo - 100) * 0.9;
		double bi = (myKgInfo / kg) * 100;
		
		if(bi < 80) {
			System.out.println("저체중 입니다.");
		}else if(bi >= 80 && bi < 100) {
			System.out.println("정상체중 입니다.");
		}else if(bi >= 110 && bi < 130) {
			System.out.println("과체중 입니다.");
		}else {
			System.out.println("비만 입니다.");
		}
		sc.close();
		
	}
}
