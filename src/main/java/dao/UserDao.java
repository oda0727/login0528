package dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.entity.UserDetailEntity;



@Repository
public class UserDao {

	@Autowired
	EntityManager en;
	
	
	public void registUser(UserDetailEntity entity) {
		// TODO 自動生成されたメソッド・スタブ
		en.persist(entity);
	}

}
