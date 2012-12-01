package org.isima.hibernate.tests;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.isima.hibernate.persistance.Actionnaire;
import com.isima.hibernate.persistance.Ecole;
import com.isima.hibernate.persistance.Fournisseur;
import com.isima.hibernate.util.HibernateUtil;

public class TestActionnaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.currentSession();
		
		
		Transaction tx=session.beginTransaction();
		Actionnaire ac= new Actionnaire();
		ac.setId(1);
		ac.setNom("discovery");
		Ecole ec=new Ecole();
		ec.setNom("umt");
		ec.setNombreSalles(25);
		Fournisseur fr1=new Fournisseur();
		fr1.setNom("ALLANI");
		ec.setFournisseurs(new ArrayList<Fournisseur>());
		ec.getFournisseurs().add(fr1);
		
		Ecole e2= (Ecole)session.load(Ecole.class, 1);
		
	List<Ecole> ecoles= new ArrayList<>();
	ecoles.add(ec);
	ecoles.add(e2);
	ac.setEcoles(ecoles);
		session.save(ac);
		session.flush();
		tx.commit();
	}

}
