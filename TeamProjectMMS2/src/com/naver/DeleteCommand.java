package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("1.아이디로 삭제, 2.회원번호로 삭제, 3.이메일로 삭제");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			System.out.println("아이디를 입력해주세요");
			String member_id = sc.nextLine();
			MemberDTO dto = new MemberDTO(member_id, null, null, null);
			dao.delete(dto);
			break;

		case 2:
			System.out.println("회원번호를 입력해주세요");
			int member_num = sc.nextInt();
			sc.nextLine();
			MemberDTO dto2 = new MemberDTO(member_num, null, null, null, null, null);
			dao.deleteByNum(dto2);
			break;
		case 3:
			System.out.println("이메일을 입력해주세요");
			String member_email = sc.nextLine();
			MemberDTO dto3 = new MemberDTO(null, null, null, member_email);
			dao.deleteByEmail(dto3);
			
			
			
			
			
			break;
		}
		
		
	
		
		
		
		
	
	}

	@Override
	public String toString() {
		return "4.삭제 ";
	}
	

}
