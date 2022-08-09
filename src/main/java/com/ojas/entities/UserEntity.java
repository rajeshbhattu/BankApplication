package com.ojas.entities;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="user")
//@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="id")	
	private Integer userid;
	@Column(name="username")	
	private String username;

	 private static AtomicInteger atomicInteger = new AtomicInteger(5875000);
	 
	@Column(name = "account_number", unique = true, nullable = false)
	     private Long account_number;
	@Column(name="aadhar_number")	
	private String addharnumber;
	@Column(name="email")	
	private String email;
	@Column(name="father_name")	
	private String fathername;
	@Column(name="pan_number")	
	private String pannumber;
	@Column(name="mobile_number")	
	private long mobilenumber;
	@Column(name="password")	
	private String password;
	@Column(name="IFSC")
	private String ifsc;
	@Column(name="bankname")
	private String bankname;
	@Column(name="address")
	private String address;
	
	public UserEntity(Integer userid, String username, Long account_number, String addharnumber, String email,
			String fathername, String pannumber, long mobilenumber, String password, String ifsc, String bankname,
			String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.account_number = (long) atomicInteger.incrementAndGet();
		this.addharnumber = addharnumber;
		this.email = email;
		this.fathername = fathername;
		this.pannumber = pannumber;
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.ifsc = ifsc;
		this.bankname = bankname;
		this.address = address;
	}
	

	}
	

