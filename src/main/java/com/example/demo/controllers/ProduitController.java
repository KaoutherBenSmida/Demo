package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Produit;
import com.example.demo.service.ProduitService;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "Produit")
public class ProduitController {

	@Autowired
	private ProduitService produitService;
	


	
	@GetMapping(value = "/allProducts")
	public List<Produit> findAllProduits(){
		return produitService.findAllProduits();
	}
	
	@PostMapping(value = "/saveProduct", consumes = "application/json")
	public Produit saveProduit(@RequestBody Produit p){
		return produitService.save(p);
	}
	

}
