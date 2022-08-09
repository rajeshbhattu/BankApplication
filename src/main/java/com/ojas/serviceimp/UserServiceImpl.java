package com.ojas.serviceimp;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.stereotype.Service;

import com.ojas.entities.UserEntity;
import com.ojas.model.User;
import com.ojas.repo.UserRepo;
import com.ojas.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo urepo;
	public String findByNameAndPassword(String uname,String pwd) {
		
		UserEntity user=urepo.findByUsernameAndPassword( uname,pwd);
		String p=null;
		String msg1=null;
		
	

		System.out.println(user);
		System.out.println(pwd);
	
	System.out.println(pwd+"  "+ uname);
	
		if(user!=null){
			 p=user.getPassword();
			if(p.equals(pwd)) {
		msg1="user login success";
			}
		         }
		
		else{
			msg1="invalid credentials ";
		
		}
	
	return msg1;
		
	}
	
	public UserEntity findUserProfile(String uname,String pwd ) {
		
	
		UserEntity user=urepo.findByUsernameAndPassword1(uname,pwd);
		return user;
	}
	
	public String signUpUser(User user) {
		
		long accountnum=5875000;
		
		

		String Ifsc="ICIC587";
		
		
		
		UserEntity userEntity=new UserEntity( 0,user.getUsername(),  accountnum,  user.getAadharnumber(),  user.getEmail(),user.getFathername(),user.getAadharnumber(), user.getMobilenumber(),user.getPassword() , Ifsc, user.getBankname(),user.getAddress());
		UserEntity us=new UserEntity();
		String msg1=null;
	try {
		UserEntity u=urepo.save(userEntity);
	
		System.out.println(u.toString());
		
		if(u!=null) {
			msg1="user Registered successfully";
		}
		else {
			msg1="user registration failed try again.....";
		}
	}
	catch(Exception e)
	{
		System.out.println("error");
		msg1="user registration failed try again.....";
	}
		return msg1;
	}
	
	
	
	
	public List<UserEntity> findalldata() {
		List<UserEntity> list=urepo.findAll();
		return list;
	}


	
}
