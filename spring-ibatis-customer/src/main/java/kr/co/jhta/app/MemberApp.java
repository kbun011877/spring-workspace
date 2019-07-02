package kr.co.jhta.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.MemberDao;
import kr.co.jhta.vo.Member;

public class MemberApp {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/app-context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		MemberDao memberDao = ctx.getBean(MemberDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.��ü��ȸ 2.����ȸ 3.��� 4.���� 5.���� 6.�˻� 0.����");
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.print("�޴�����> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Member> members = memberDao.getAllMembers();
				for(Member member : members) {
					System.out.println("��  ȣ : " + member.getNo());
					System.out.println("��  �� : " + member.getName());
					System.out.println("��  �� : " + member.getNickName());
					System.out.println("�̸��� : " + member.getEmail());
					System.out.println("����ó : " + member.getTel());
					System.out.println("��°� : " + member.getCity());
					System.out.println("����Ʈ : " + member.getPoint());
					System.out.println("������ : " + member.getCreateDate());
					System.out.println();
				}
				
			} else if (menu == 2) {
				System.out.println("ã���� ��ȣ�� �Է��� �ּ���");
				int num = scanner.nextInt();
				
				Member member = memberDao.getMemberByNo(num);
				
				System.out.println(member.getNo());
				System.out.println(member.getName());
				System.out.println(member.getNickName());
				System.out.println(member.getEmail());
				System.out.println(member.getTel());
				System.out.println(member.getCity());
				System.out.println(member.getPoint());
				System.out.println(member.getCreateDate());
				
			} else if (menu == 3) {
				Member member = new Member();
				
				System.out.println("�̸��� �Է����ּ���");
				member.setName(scanner.next());
				System.out.println("������ �Է����ּ���");
				member.setNickName(scanner.next());
				System.out.println("�̸����� �Է����ּ���");
				member.setEmail(scanner.next());
				System.out.println("��� ���ø��� �Է����ּ���");
				member.setCity(scanner.next());
				System.out.println("��ȭ��ȣ�� �Է����ּ���");
				member.setTel(scanner.next());
				System.out.println("����Ʈ�� �Է����ּ���");
				member.setPoint(scanner.nextInt());
				
				memberDao.insertMember(member);
				System.out.println("����Ǿ����ϴ�.");
				
			} else if (menu == 4) {
				System.out.println("�����Ͻ� ȸ���� �Է����ּ���");
				Member member = memberDao.getMemberByNo(scanner.nextInt());
				
				while(true) {
					System.out.println("�����ҽ� ����� �����ϼ���");
					System.out.println("------------------------------------------------------");
					System.out.println("1.�̸� 2.���� 3.�̸��� 4.���ø� 5.��ȭ��ȣ 6.����Ʈ 0.����");
					System.out.println("------------------------------------------------------");
					int updateMenu = scanner.nextInt();
					
					if(updateMenu == 1) {
						System.out.println("������ �̸��� �Է����ּ���");
						member.setName(scanner.next());
						memberDao.updateMember(member);
						System.out.println("����Ϸ�");
						
						
					} else if(updateMenu == 2) {
						System.out.println("������ ������ �Է����ּ���");
						member.setNickName(scanner.next());
						memberDao.updateMember(member);
						System.out.println("����Ϸ�");
						
					} else if(updateMenu == 3) {
						System.out.println("������ �̸����� �Է����ּ���");
						member.setEmail(scanner.next());
						memberDao.updateMember(member);
						System.out.println("����Ϸ�");
					
					} else if(updateMenu == 4) {
						System.out.println("������ ���ø��� �Է����ּ���");
						member.setCity(scanner.next());
						memberDao.updateMember(member);
						System.out.println("����Ϸ�");
						
					} else if(updateMenu == 5) {
						System.out.println("������ ��ȭ��ȣ�� �Է����ּ���");
						member.setTel(scanner.next());
						memberDao.updateMember(member);
						System.out.println("����Ϸ�");
						
					} else if(updateMenu == 6) {
						System.out.println("������ ����Ʈ�� �Է����ּ���");
						member.setPoint(scanner.nextInt());
						memberDao.updateMember(member);
						System.out.println("����Ϸ�");
						
					} else if(updateMenu == 0) {
						System.out.println("�����մϴ�");
						break;
						
					}
					
				}
				
			} else if (menu == 5) {
				System.out.println("�����Ͻ� ȸ���� ��ȣ�� �Է��� �ּ���");
				int num = scanner.nextInt();
				memberDao.deleteMember(num);
				System.out.println("�����Ϸ�");
				
			} else if (menu == 6) {
				
				Map<String, Object> map = new HashMap<String, Object>();
				System.out.println("�˻� �ɼ��� �Է��ϼ��� (��ȣ:no, �̸�:name, �г���:nick)");
				String option = scanner.next();
				if("no".equals(option)) {
					System.out.println("��ȣ�� �����ϼ̽��ϴ�. �˻��� ��ȣ�� �Է��ϼ���");
				} else if("name".equals(option)) {
					System.out.println("�̸��� �����ϼ̽��ϴ�. �˻��� �̸��� �Է��ϼ���");
				} else if("nick".equals(option)) {
					System.out.println("�г����� �����ϼ̽��ϴ�. �˻��� �г����� �Է��ϼ���");
				} 
				String input= scanner.next();
				
				map.put("status", option);
				map.put("value",input);
				List<Member> members = memberDao.searchMember(map);
				for (Member member : members) {
					
					System.out.println("��ȣ: "+member.getNo());
					System.out.println("�̸�: "+member.getName());
					System.out.println("�г���: "+member.getNickName());
					System.out.println("��ȭ��ȣ: "+member.getTel());
					System.out.println("�̸���: "+member.getEmail());
					System.out.println("����: "+member.getCity());
					System.out.println("����Ʈ: "+member.getPoint());
					System.out.println("������: "+member.getCreateDate());
					
				}
				
			} else if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
		}
		
	}
}
