package com.project.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.model.UserGuide;
import com.project.service.UserService;

@Component
@ManagedBean(name = "userController")
@RequestScoped
public class UserController implements Serializable {

	private static final long serialVersionUID = 1L;

	private UserGuide userGuide = new UserGuide();

	@Autowired
	private UserService userService;

	public Integer saveUser() throws Exception {
		int status = userService.save(this.userGuide);
		userGuide = new UserGuide();
		return status;
	}

	public List<UserGuide> getAllUser() throws Exception {
		return userService.getAllUser();
	}

	
	public UserGuide getUserGuide() {
		return userGuide;
	}

	public void setUserGuide(UserGuide userGuide) {
		this.userGuide = userGuide;
	}

	
}