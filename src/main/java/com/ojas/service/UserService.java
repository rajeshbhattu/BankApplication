package com.ojas.service;

import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;

import com.ojas.entities.UserEntity;
import com.ojas.model.User;

public interface UserService {
	public String findByNameAndPassword(String uname,String pwd);
	
	public String signUpUser(User user);
	public UserEntity findUserProfile(String uname,String pwd);
}
