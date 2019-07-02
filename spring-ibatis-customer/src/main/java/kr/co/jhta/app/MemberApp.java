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
			System.out.println("1.전체조회 2.상세조회 3.등록 4.수정 5.삭제 6.검색 0.종료");
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.print("메뉴선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Member> members = memberDao.getAllMembers();
				for(Member member : members) {
					System.out.println("번  호 : " + member.getNo());
					System.out.println("이  름 : " + member.getName());
					System.out.println("별  명 : " + member.getNickName());
					System.out.println("이메일 : " + member.getEmail());
					System.out.println("연락처 : " + member.getTel());
					System.out.println("사는곳 : " + member.getCity());
					System.out.println("포인트 : " + member.getPoint());
					System.out.println("생성일 : " + member.getCreateDate());
					System.out.println();
				}
				
			} else if (menu == 2) {
				System.out.println("찾으실 번호를 입력해 주세요");
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
				
				System.out.println("이름을 입력해주세요");
				member.setName(scanner.next());
				System.out.println("별명을 입력해주세요");
				member.setNickName(scanner.next());
				System.out.println("이메일을 입력해주세요");
				member.setEmail(scanner.next());
				System.out.println("사는 도시명을 입력해주세요");
				member.setCity(scanner.next());
				System.out.println("전화번호을 입력해주세요");
				member.setTel(scanner.next());
				System.out.println("포인트을 입력해주세요");
				member.setPoint(scanner.nextInt());
				
				memberDao.insertMember(member);
				System.out.println("저장되었습니다.");
				
			} else if (menu == 4) {
				System.out.println("변경하실 회원을 입력해주세요");
				Member member = memberDao.getMemberByNo(scanner.nextInt());
				
				while(true) {
					System.out.println("변경할실 목록을 선택하세요");
					System.out.println("------------------------------------------------------");
					System.out.println("1.이름 2.별명 3.이메일 4.도시명 5.전화번호 6.포인트 0.종료");
					System.out.println("------------------------------------------------------");
					int updateMenu = scanner.nextInt();
					
					if(updateMenu == 1) {
						System.out.println("변경할 이름을 입력해주세요");
						member.setName(scanner.next());
						memberDao.updateMember(member);
						System.out.println("변경완료");
						
						
					} else if(updateMenu == 2) {
						System.out.println("변경할 별명을 입력해주세요");
						member.setNickName(scanner.next());
						memberDao.updateMember(member);
						System.out.println("변경완료");
						
					} else if(updateMenu == 3) {
						System.out.println("변경할 이메일을 입력해주세요");
						member.setEmail(scanner.next());
						memberDao.updateMember(member);
						System.out.println("변경완료");
					
					} else if(updateMenu == 4) {
						System.out.println("변경할 도시명을 입력해주세요");
						member.setCity(scanner.next());
						memberDao.updateMember(member);
						System.out.println("변경완료");
						
					} else if(updateMenu == 5) {
						System.out.println("변경할 전화번호을 입력해주세요");
						member.setTel(scanner.next());
						memberDao.updateMember(member);
						System.out.println("변경완료");
						
					} else if(updateMenu == 6) {
						System.out.println("변경할 포인트을 입력해주세요");
						member.setPoint(scanner.nextInt());
						memberDao.updateMember(member);
						System.out.println("변경완료");
						
					} else if(updateMenu == 0) {
						System.out.println("종료합니다");
						break;
						
					}
					
				}
				
			} else if (menu == 5) {
				System.out.println("삭제하실 회원의 번호를 입력해 주세요");
				int num = scanner.nextInt();
				memberDao.deleteMember(num);
				System.out.println("삭제완료");
				
			} else if (menu == 6) {
				
				Map<String, Object> map = new HashMap<String, Object>();
				System.out.println("검색 옵션을 입력하세요 (번호:no, 이름:name, 닉네임:nick)");
				String option = scanner.next();
				if("no".equals(option)) {
					System.out.println("번호를 선택하셨습니다. 검색할 번호를 입력하세요");
				} else if("name".equals(option)) {
					System.out.println("이름을 선택하셨습니다. 검색할 이름를 입력하세요");
				} else if("nick".equals(option)) {
					System.out.println("닉네임을 선택하셨습니다. 검색할 닉네임을 입력하세요");
				} 
				String input= scanner.next();
				
				map.put("status", option);
				map.put("value",input);
				List<Member> members = memberDao.searchMember(map);
				for (Member member : members) {
					
					System.out.println("번호: "+member.getNo());
					System.out.println("이름: "+member.getName());
					System.out.println("닉네임: "+member.getNickName());
					System.out.println("전화번호: "+member.getTel());
					System.out.println("이메일: "+member.getEmail());
					System.out.println("지역: "+member.getCity());
					System.out.println("포인트: "+member.getPoint());
					System.out.println("생성일: "+member.getCreateDate());
					
				}
				
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}
