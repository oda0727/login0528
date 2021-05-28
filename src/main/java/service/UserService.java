package service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import domain.entity.UserDetailEntity;

@Service
@Transactional
public class UserService {

	@Autowired
	UserDao userDao;
	
	public void registUserDetail(UserDetailEntity entity) {
		
		userDao.registUser(entity);
	}
	
}
