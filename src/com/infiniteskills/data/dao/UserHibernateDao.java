package com.infiniteskills.data.dao;

import java.util.List;

import com.infiniteskills.data.dao.interfaces.userDao;
import com.infiniteskills.data.entities.User;

public class UserHibernateDao extends abstractDao<User,Long> implements userDao{

	public List<User> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
