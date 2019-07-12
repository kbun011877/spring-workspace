package kr.co.hta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.UserDao;
import kr.co.hta.exception.AlreadyUsedIdException;
import kr.co.hta.vo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User login(String id) {
		User user = userDao.getUserById(id);
		return user;
	}
	
	@Override
	public void registerUser(User user) {
		User user1 = userDao.getUserById(user.getId());
		if(user1 != null) {
			throw new AlreadyUsedIdException("["+user1.getId()+"]는 이미 존재하는 아이디 입니다.");
		}
		
		userDao.addUser(user);			
		
	}
	
	@Override
	public User getUser(String id) {
		return userDao.getUserById(id);
	}
	
}
