package com.infiniteskills.data.dao.interfaces;

import java.util.List;

import com.infiniteskills.data.entities.User;

public interface userDao extends Dao<User,Long>{
public List<User> findByFirstName(String firstName);
}
