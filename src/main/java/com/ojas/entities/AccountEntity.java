package com.ojas.entities;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.persistence.TemporalType;


import org.hibernate.annotations.UpdateTimestamp;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="account")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountEntity {

@Id
@GeneratedValue(strategy=GenerationType.AUTO) 
@Column(name="acid")
private Integer accountid;
@Column(name="creditbal")
private Integer creditbal;
@Column(name="debitbal")
private Integer debitbal;
@Column(name="username")
private String username;
@Column(name="transactionid")
private Integer transactionid;
@Column(name="actype")
private String actype;
@Column(name="id")
private Integer userid;
@Column(name="avilablebal")
private Integer avilablebal;

@Column(name="date")

@UpdateTimestamp
private LocalDateTime cdate;



}
