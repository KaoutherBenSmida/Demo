package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Produit;

public interface ProduitService {
	public List<Produit> findAllProduits();
	public Produit save(Produit p);

}
