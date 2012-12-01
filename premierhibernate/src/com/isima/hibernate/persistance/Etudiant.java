package com.isima.hibernate.persistance;

public class Etudiant {

	private Ecole ecole;
	private int id;
	private String nom;

	public void setEcole(Ecole ecole) {this.ecole = ecole;}
	public Ecole getEcole() {	return ecole;}
	public void setId(int id) {this.id = id;}
	public int getId() {return id;}
	public void setNom(String nom) {this.nom = nom;}
	public String getNom() {return nom;}

}
