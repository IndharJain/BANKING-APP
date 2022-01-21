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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BillerRegister")
public class Registry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" , nullable = true)
	private int id;

	@Column(name = "Biller_Provider_Id")
	private String billerProviderId;

	@Column(name = "Acc_Number")
	private int accNumber;

	@Column(name = "Consumer_Number")
	private int consumerNumber;

	@Column(name = "TimeStamp")
	private int timeStamp;

}
