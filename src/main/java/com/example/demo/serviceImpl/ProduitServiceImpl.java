package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Produit;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.service.ProduitService;


@Service
public class ProduitServiceImpl implements ProduitService{

	@Autowired
	private ProduitRepository produitRepository;
	@Override
	public List<Produit> findAllProduits() {
		
		return produitRepository.findAll();
	}
	@Override
	public Produit save(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

}
