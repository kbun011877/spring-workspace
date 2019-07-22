package kr.co.hta.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.hta.dao.UserDao;
import kr.co.hta.vo.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean register(User user) {
		if (userDao.getUserById(user.getId()) != null) {
			return false;
		}
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		userDao.addUser(user);
		return true;
	}
	
	@Override
	public User login(String id, String password) {
		User user = userDao.getUserById(id);
		if (user == null) {
			return null;
		}
		if (!user.getPassword().equals(DigestUtils.md5Hex(password))) {
			return null;
		}
		return user;
	}
}
