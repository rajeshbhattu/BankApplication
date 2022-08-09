package com.ojas.serviceimp;

import java.time.LocalDateTime;

import java.util.List;
import java.util.Optional;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entities.AccountEntity;
import com.ojas.repo.AccountRepo;
import com.ojas.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
private AccountRepo arepo;
	@Override
	public String creditBal(AccountEntity ac)  {
		
		int bal=ac.getCreditbal();
		System.out.println(ac);
		String msg=null;
		try {
			//AccountEntity acEn	=arepo.save(ac);
System.out.println(ac.getCdate());
Optional<AccountEntity>acen=arepo.findByUserid(ac.getUserid(),ac.getTransactionid()-1);

AccountEntity ar=acen.get();
int m=bal+ar.getAvilablebal();
System.out.println(m);
AccountEntity ac1=new AccountEntity( ac.getAccountid(),ac.getCreditbal(), ac.getDebitbal() ,ac.getUsername() , ac.getTransactionid() ,
		ac.getActype() , ac.getUserid() , m , null ) ;
AccountEntity acEn	=arepo.save(ac1);
System.out.println(bal);
System.out.println("-----"+ar);
	
	
		if(acEn!=null) {
			msg="amount credited sucessfully"+bal;
		}
		
		}
		catch(Exception e) {
			msg="transaction failed";
		}
	System.out.println(ac.getUserid());
	System.out.println(bal);
		
			
		return msg;
	}

	@Override
	public String debitBal(AccountEntity ac) {
		// TODO Auto-generated method stub
		return null;
	}

}
