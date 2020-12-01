package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		System.out.println("1.���̵�� ����, 2.ȸ����ȣ�� ����");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			System.out.println("���̵� �Է����ּ���");
			String member_id = sc.nextLine();
			dao.delete(dao.selectByEquelId(member_id));
			break;

		case 2:
			System.out.println("ȸ����ȣ�� �Է����ּ���");
			int member_num = sc.nextInt();
			sc.nextLine();
			dao.delete(dao.selectByNum(member_num));
			break;
		// �̸��� �Է��ؼ� ����(�ߺ��̶�� ���� �̸� ����Ʈ ������ �� ȸ����ȣ�� ����)
		
		}

	}

	@Override
	public String toString() {
		return "4.���� ";
	}
	
}
