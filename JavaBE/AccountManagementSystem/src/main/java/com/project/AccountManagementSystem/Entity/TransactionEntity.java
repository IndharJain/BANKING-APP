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
@Table(name="TransactionTable")
public class TransactionEntity {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	
	@Column(name="accountNumber")
	String accountNumber;
	
	@Column(name="type")
	String type;
	
	@Column(name="amount")
	String amount;
	
	@Column(name="transactionId")
	String transactionId;
	
	@Column(name="timeStamp")
	String timeStamp;
}
