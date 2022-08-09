package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entities.AccountEntity;
import com.ojas.serviceimp.AccountServiceImpl;


@RestController
public class AccountController {
	@Autowired
	AccountServiceImpl acimpl;
	
	
	@PostMapping("/credit")
	public String creditBalance(@RequestBody AccountEntity ac ) {
	String msg=acimpl.creditBal(ac);
	return msg;
	}
	
		
}
