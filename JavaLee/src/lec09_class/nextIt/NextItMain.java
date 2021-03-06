package lec09_class.nextIt;

import java.util.ArrayList;

/**
 * 실행(main 메소드)만 하는 클래스 
 */
public class NextItMain {
	public static void main(String[] args) {
		// 클래스 객체 선언
		Student eunji = new Student();
		
		// 객체의 필드 변수 접근
		System.out.println(eunji.name);
		System.out.println(eunji.stress);
		System.out.println(eunji.level);
		
		// 값을 입력하지 않으면, 객체의 필드변수들은 
		// 초기값들로 설정되어 있다.
		// 숫자형 변수의 초기값 = 0
		// boolean형 변수의 초기값 = false
		// 참조형 변수의 초기값 = null
		
		System.out.println("\n=======================================\n");
		
		// 객체의 상태(State), 속성 설정
		eunji.name = "은지";
		System.out.println(eunji.name);
		eunji.stress = 0;
		eunji.level = 30;
		
		// 객체의 메소드 실행
		eunji.goToSchool();
		System.out.println(eunji.stress);
		
		eunji.eatLunch();
		eunji.goToHome();
		System.out.println();
		
		// 두 번째 객체
		Student namgyu = new Student();
		
		namgyu.name = "남규";
		namgyu.stress = 0;
		namgyu.level = 50;
		
		System.out.println(namgyu.name);
		System.out.println(namgyu.stress);		
		System.out.println(namgyu.level);
		
		namgyu.goToSchool();
		namgyu.eatLunch();
		namgyu.goToHome();
		
		System.out.println("\n=================================\n");
		
		// 필드값을 입력 받는 생성자로 객체 선언
		Student minwoo = new Student("민우", 0, 30);
		
		// 이름과 레벨만 입력받는 생성자로 객체 선언
		Student bumseok = new Student("범석", 40);
		
		System.out.println("\n==================================\n");
		
		// 경로, 클래스명@해시코드 16진수 문자열(HexString) 표출
		System.out.println(eunji);	
		System.out.println(eunji.hashCode());
		
		// 현재 객체 정보를 한눈에 보고 싶다
		System.out.println(namgyu);
		System.out.println(namgyu.toString());
		
		System.out.println("\n=================================\n");
		
		// 객체 복사
		Student copyNamgyu = new Student(namgyu.name, namgyu.stress, namgyu.level);
		
		// 객체 리스트(ArrayList)에 담아서 사용
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		stuList.add(eunji);
		stuList.add(namgyu);
		stuList.add(bumseok);
		stuList.add(minwoo);
		stuList.add(copyNamgyu);
		
		// 하루가 지났습니다.
		for(int i = 0; i < stuList.size(); i++) {
			stuList.get(i).goToSchool();
			stuList.get(i).eatLunch();
			stuList.get(i).goToHome();
		}
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i).toString());
		}
		
		// 향상된 for문 사용
		for(Student stu : stuList) {
			stu.goToSchool();
			stu.eatLunch();
			stu.goToHome();
		}
		
		for(Student stu : stuList) {
			System.out.println(stu.toString());
		}
		
		System.out.println("\n==============================\n");
		
		// 레벨을 이용하여 정렬하기
		
		for(int i = 0; i < stuList.size(); i++) {
			boolean swapped = false;
			for(int j = 0; j < stuList.size() -1 - i; j++) {
				// 아래 조건에서 부등호 방향만 바꿔주면 
				// 오름차순과 내림차순이 바뀐다.
				if(stuList.get(j).level < stuList.get(j+1).level) {
					Student temp = stuList.get(j);
					stuList.set(j, stuList.get(j+1));
					stuList.set(j+1, temp);
					swapped = true;
				}
			}
			if(swapped != true) { // swapped == false
				System.out.println("이미 정렬완료");
				break;
			}
			System.out.println(i + "회 시행");
			
		}
		
		for(Student stu : stuList) {
			System.out.println(stu.toString());
		}
		
		// 등수와 함께 출력
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println((i+1) + "등. " + stuList.get(i).toString());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
