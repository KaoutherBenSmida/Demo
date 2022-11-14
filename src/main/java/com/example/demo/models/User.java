package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId",unique = true, nullable = false)
	private int userId;
	private String userNom;
	private String userPrenom;
	private String userEmail;
	private String userLogin;
	private String userPassword;
	private int userProfile;
	private int userPermission;
	private String userWalletAdresse;
	private String userImage;

}
