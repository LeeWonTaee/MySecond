package submit.submit_0107;

import java.util.Scanner;

public class Submit05 {
	public static void main(String[] args) {
		int randomNum = (int)(Math.random() *50 +1);
		Scanner sc = new Scanner(System.in);
		
		for(int i = 5; i < i+1; i--) {
				System.out.print("숫자를 입력해주세요 : ");
				String num = sc.nextLine();
				int numVal = Integer.parseInt(num);
				if(numVal > 50 || numVal < 1) {
					System.out.println("1부터 50까지의 숫자만 입력해주세요.");
					break;
				}else {
					if((i-1) == 0) {
						System.out.println("실패하였습니다. 정답은 " + randomNum + "입니다.");
						break;
					}else {
						if(randomNum == numVal) {
							System.out.println("정답입니다.");
							break;
						}else if(randomNum < numVal) {
							System.out.println("다운!! 기회가" + (i-1) +"번 남았습니다.");
						}else if (randomNum > numVal){
							System.out.println("업!! 기회가" + (i-1) +"번 남았습니다.");
						}
					}
				}
				
		}
		sc.close();
	}
}
