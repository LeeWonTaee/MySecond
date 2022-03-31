package submit_1214;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import submit_1214.dao.BoardDao;
import submit_1214.model.BoardVO;
import submit_1214.model.MemberVO;
import submit_1214.service.BoardService;
import submit_1214.service.MemberService;

public class MemberAndBoardMain {
	public static void main(String[] args) {
		MemberService memberService = MemberService.getInstance();
		BoardService boardService = BoardService.getInstnace();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>> ");
			
			int select = 0;
			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}
			
			if(select == 1) {
				System.out.println("아이디를 입력해주세요");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>> ");
				String pw = sc.nextLine();
				
				MemberVO memv = memberService.getMem(id);
				
				if(memv.getMemId() != null) {
					System.out.println("중복된 아이디 입니다.");
				}else {
					int resultCnt = memberService.insertMember(id, pw);
					
					if(resultCnt > 0) {
						System.out.println("회원가입 완료");
					}else {
						System.out.println("오류가 발생했습니다.");
					}
				}
			}else if(select == 2) {
				System.out.println("아이디를 입력해주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>> ");
				String pw = sc.nextLine();
				
				MemberVO mem = memberService.getMem(id);
				
				if(mem.getMemPw().equals(pw)) {
					System.out.println("로그인 되었습니다.");
				}
				while(true) {
					System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
					System.out.print(">>> ");
					
					select = 0;
					try {
						select = Integer.parseInt(sc.nextLine());
					} catch (Exception e) {
						System.out.println("숫자만 입력해주세요.");
						continue;
					}
					
					if(select == 1) {
						System.out.print("글 제목을 입력해주세요 : ");
						String title = sc.nextLine();
						System.out.print("글 내용을 입력해주세요 : ");
						String content = sc.nextLine();
						int boradCnt = boardService.insertBoard(title, content, mem);
						if(boradCnt > 0) {
							System.out.println("글이 작성되었습니다.");
						}else {
							System.out.println("오류가 발생했습니다.");
						}
					}else if(select == 2) {
						System.out.print("글 번호를 입력해주세요 : ");
						int no = Integer.parseInt(sc.nextLine());
						BoardVO bov = boardService.selectBoard(no);
						System.out.println("=================================");
						System.out.println("제목 : " + bov.getBoTitle());
						System.out.println("작성자 : " + bov.getMemId());
						System.out.println("작성일 : " + bov.getBoDate());
						System.out.println("글내용 : " + bov.getBoContent());
						System.out.println("=================================");
						ArrayList<BoardVO> boardList = boardService.boardList();
						for(int i = 0; i < boardList.size(); i++) {
							System.out.println(boardList.get(i).toString());
						}
						
					}else if(select == 3) {
						System.out.println("로그아웃 하였습니다.");
//						continue;
						break;
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
				
			}else if(select == 3) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못입력 하셨습니다.");
			}
		}
	}


}
