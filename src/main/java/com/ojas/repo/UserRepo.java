package com.ojas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ojas.entities.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity,Integer>{
	@Query("select u from UserEntity u where u.username=?1 and password=?2")
	public UserEntity findByUsernameAndPassword(String uname,String pwd);
	
	
	@Query("select u from UserEntity u where u.username=?1 and password=?2")
	public UserEntity findByUsernameAndPassword1(String uname,String pwd);
}
