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



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Application ID")
	private int id;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Customer_Name")
	private String name;
	
	@Column(name="Date_Of_Birth")
	private String dob;
	
	@Column(name="Email_Address")
	private String email;
	
	@Column(name="Mobile_Number")
	private int mobileNumber;
	
	@Column(name="PAN_Number")
	private String panNumber;
	
	@Column(name="Aadhar_Number")
	private String aadharNumber;
	
	@Column(name="PANCard_AadharCard")
	private String scannedCopies;

}
