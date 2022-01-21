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
@Table(name="AcAppprovalTable")
public class AccountApprovalEntity {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	
	
	@Column(name="applicationId")
	String applicationId;
	
	@Column(name="status")
	String status;
	
	@Column(name="adminId")
	String adminId;
	
	@Column(name="timeStamp")
	String timeStamp;
	
}
