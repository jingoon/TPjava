package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("1.아이디로 삭제, 2.회원번호로 삭제");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			System.out.println("아이디를 입력해주세요");
			String member_id = sc.nextLine();
			dao.delete(dao.selectByEquelId(member_id));
			break;

		case 2:
			System.out.println("회원번호를 입력해주세요");
			int member_num = sc.nextInt();
			sc.nextLine();
			dao.delete(dao.selectByNum(member_num));
			break;
		// 이름을 입력해서 삭제(중복이라면 같은 이름 리스트 보여준 후 회원번호로 삭제)
		
		}

	}

	@Override
	public String toString() {
		return "4.삭제 ";
	}
	
}
