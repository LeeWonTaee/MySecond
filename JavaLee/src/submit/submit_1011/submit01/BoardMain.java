package submit.submit_1011.submit01;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		BoardDB boardDB = BoardDB.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글목록 | 2. 글쓰기 | 3. 종료");
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine()); 
			if(select == 1) {
				boardDB.showList();
			}else if(select == 2) {
				System.out.print("글 제목을 입력해주세요 : ");
				String title = sc.nextLine();
				System.out.print("글 내용을 입력해주세요 : ");
				String content = sc.nextLine();
				int no = boardDB.sizeBoard();
				String date = boardDB.dateBoard();
				
				boardDB.addBoard(new Board(no, title, content, date));
				
			}else if(select == 3) {
				break;
			}
		}
	}
}
