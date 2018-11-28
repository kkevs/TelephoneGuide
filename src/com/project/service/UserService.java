package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.common.Commons;
import com.project.dao.UserDao;
import com.project.model.UserGuide;

@Service
public class UserService implements Commons<Integer, UserGuide> {
	
	@Autowired
	private UserDao userDao;
	
	public UserGuide getUserById(int userId) throws Exception{
		return userDao.getUserById(userId);
	}

	@Override
	public Integer save(UserGuide t2) throws Exception {
		return userDao.save(t2);
	}

	@Override
	public List<UserGuide> getAllUser() throws Exception {
		return userDao.getAllUser();
	}
}
