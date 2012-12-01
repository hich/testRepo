package com.isima.hibernate.persistance;

import java.util.List;

public class Ecole {

private int num;
private String nom;
private String address;
private int nombreSalles;
private List<Enseignant> enseignants;
private List<Etudiant> etudiants;
private List<Fournisseur> fournisseurs;
private List<Actionnaire> actionnaires;

public String getNom() {return nom;}

public void setNom(String nom) {	this.nom = nom;}

public String getAdresse() {return address;}

public void setAdresse (String address) {this.address = address;}

public int getNombreSalles() {return nombreSalles;}

public void setNombreSalles(int nombreSalles) {this.nombreSalles = nombreSalles;}

public void setNum(int num) {this.num = num;}
public int getNum() {return num;}

public String toString(){
	return ("-------------------------------\n" +
			"Nom: "+nom+"\n Adresse: "+address+
			"\n Nombre de salles:"+nombreSalles);}
public void setEnseignants(List<Enseignant> enseignants) {
	this.enseignants = enseignants;
}
public List<Enseignant> getEnseignants() {
	return enseignants;
}
public void setEtudiants(List<Etudiant> etudiants) {
	this.etudiants = etudiants;
}
public List<Etudiant> getEtudiants() {
	return etudiants;
}
public void setFournisseurs(List<Fournisseur> fournisseurs) {
	this.fournisseurs = fournisseurs;
}
public List<Fournisseur> getFournisseurs() {
	return fournisseurs;
}
public void setActionnaires(List<Actionnaire> actionnaires) {
	this.actionnaires = actionnaires;
}
public List<Actionnaire> getActionnaires() {
	return actionnaires;
}
}
