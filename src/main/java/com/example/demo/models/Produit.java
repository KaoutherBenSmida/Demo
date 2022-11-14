package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Produit {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produitId",unique = true, nullable = false)
	private int produitId;
	private String produitLibelle;
	private String produitDescripton;
	private String produitAbbreviation;
	
	
}
