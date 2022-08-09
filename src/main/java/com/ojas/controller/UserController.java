package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entities.UserEntity;
import com.ojas.model.Credential;
import com.ojas.model.User;
import com.ojas.serviceimp.UserServiceImpl;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class UserController {
	@Autowired
private UserServiceImpl uimpl;
	
	
	@PostMapping("/login")
	
	public String login(@RequestBody Credential crd) {
		
	
    String	uname=	 crd.getUsername();
	String pwd=crd.getPassword();
	
	String u=	uimpl.findByNameAndPassword(uname, pwd);
	
		return u;	
	}

	
	
	@PostMapping("/signup")
	public String userSignUp(@RequestBody User user) {
		
	String msg=	uimpl.signUpUser(user);
	return msg;
	}
	
	@PostMapping("/profile")
	public UserEntity userProfile(@RequestBody Credential crd) {
		String uname=crd.getUsername();
		String pwd=crd.getPassword();
UserEntity userentity=	uimpl.findUserProfile(uname,pwd);
	return userentity;
	}
	
	
}
