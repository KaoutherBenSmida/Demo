package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer>{

}
