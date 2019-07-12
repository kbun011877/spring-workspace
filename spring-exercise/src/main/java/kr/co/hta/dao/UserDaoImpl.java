package kr.co.hta.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.hta.vo.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public User getUserById(String userId) {
		return (User) template.queryForObject("user.getUserById", userId);
	}
	
	@Override
	public void addUser(User user) {
		template.insert("user.addUser", user);
	}
}
