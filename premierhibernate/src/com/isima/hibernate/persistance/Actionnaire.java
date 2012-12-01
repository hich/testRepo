package com.isima.hibernate.persistance;

import java.util.List;

public class Actionnaire {

	private int id;
	private String  nom;
	private List<Ecole> ecoles;
	public int getId() {	return id;}
	public void setId(int id) {this.id = id;}
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	public List<Ecole> getEcoles() {return ecoles;}
	public void setEcoles(List<Ecole> ecoles) {this.ecoles = ecoles;}
	
}

