package com.project.AccountManagementSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="payeeTable")
public class PayeeEntity {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	
	@Column(name="accountNumber")
	String accountNumber;
	
	@Column(name="holderName")
	String holderName;
	
	@Column(name="payeeAcNo")
	String payeeAccountNumber;
	
	@Column(name="timeStamp")
	String timeStamp;
}
