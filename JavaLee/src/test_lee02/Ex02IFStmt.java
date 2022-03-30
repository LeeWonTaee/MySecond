package test_lee02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02IFStmt {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		//국, 영, 수 3과목의 점수를 입력 받고, 총점과 평균, 등급을 구하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어 : ");
		int kor  = Integer.parseInt(reader.readLine());
		if (kor > 100 || kor < 0) {
			System.out.println("1부터 100사이의 숫자만 입력해주세요.");
			return;
		}
		
		System.out.print("영어 : ");
		int eng  = Integer.parseInt(reader.readLine());
		if (eng > 100 || eng < 0) {
			System.out.println("1부터 100사이의 숫자만 입력해주세요.");
			return;
		}
		
		System.out.print("수학 : ");
		int math  = Integer.parseInt(reader.readLine());
		if (math > 100 || math < 0) {
			System.out.println("1부터 100사이의 숫자만 입력해주세요.");
			return;
		}
		
		//총점
		int total = kor + eng + math;
		System.out.println("총점 : " + total);
		//평균
		float avg = total / 3.0f;
		System.out.println("평균 : " + avg);
		
		//등급
		String grade = "";
		
		if (avg >= 95) {
			System.out.println("등급 : A+");
		}
		else if (avg >= 90) {
			System.out.println("등급 : A");
		}
		else if (avg >= 85) {
			System.out.println("등급 : B+");
		}
		else if (avg >= 80) {
			System.out.println("등급 : B");
		}
		else if (avg >= 75) {
			System.out.println("등급 : C+");
		}
		else if (avg >= 70) {
			System.out.println("등급 : C");
		}
		else if (avg >= 65) {
			System.out.println("등급 : D+");
		}
		else if (avg >= 60) {
			System.out.println("등급 : D");
		}
		else{
			System.out.println("등급 : F");
		}
		/*
		 if (avg >= 95){
		 	grade = "A+";
		 }
		 else if (avg >= 90){
		 	grade = "A";
		 }
		 .
		 .
		 .
		 else {
		 	grade = "F"
		 }
		 
		 if (avg > 60 && avg % 10 >= 5 || avg ==100){
		 	grade += "+";
		 }
		 
		 System.out.printf("총점 : %d, 평균 : %5.2f, 등급 : %s:", total, avg, grade);
		*/
			
	}

}
