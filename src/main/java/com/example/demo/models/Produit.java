package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Produit {
	
	
	@Id
	private int produitId;
	private String produitLibelle;
	private String produitDescripton;
	private String produitAbbreviation;
	
	
}
