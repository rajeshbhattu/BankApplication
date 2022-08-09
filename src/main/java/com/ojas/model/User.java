package com.ojas.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	
		
	    private String username;
	  
		private String aadharnumber;
	
		private String email;
		
		private String fathername;
		
		private String pannumber;
		
		private long mobilenumber;
	
		private String password;
		private String address;
		private String bankname;
		
		}
		
	


