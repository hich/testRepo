package com.isima.hibernate.persistance;

import java.util.Date;

public class Evennement {
private int id;
private String titre;
private Date date;

private Ecole ecole;

public int getId() {return id;}

public void setId(int id) {	this.id = id;}

public String getTitre() {	return titre;}

public void setTitre(String titre) {this.titre = titre;}

public Date getDate() {return date;}

public void setDate(Date date) {	this.date = date;}

public void setEcole(Ecole ecole) {	this.ecole = ecole;}

public Ecole getEcole() {	return ecole;}

}
