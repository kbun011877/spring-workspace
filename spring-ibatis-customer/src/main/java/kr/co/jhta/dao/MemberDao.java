package kr.co.jhta.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Member;

public class MemberDao {

	private SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	public List<Member> getAllMembers() {
		return template.queryForList("getAllMembers");
	}
	
	public Member getMemberByNo(int no) {
		return (Member) template.queryForObject("getMemberByNo", no);
	}
	
	public void updateMember(Member member) {
		template.update("updateMember", member);
	}
	
	public void deleteMember(int no) {
		template.delete("deleteMember", no);
	}
	
	public void insertMember(Member member) {
		template.insert("insertMember", member);
	}
	
	public List<Member> searchMember(Map<String, Object> map) {
		return  template.queryForList("searchMember", map);
	}
	
}
