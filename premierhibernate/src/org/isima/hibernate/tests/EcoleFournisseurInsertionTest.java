package org.isima.hibernate.tests;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.isima.hibernate.persistance.Ecole;
import com.isima.hibernate.persistance.Fournisseur;
import com.isima.hibernate.util.HibernateUtil;

public class EcoleFournisseurInsertionTest {
	public static void main(String[] args) {
		

		Session session=HibernateUtil.currentSession();
		
		
		Transaction tx=session.beginTransaction();
		Ecole ec=new Ecole();
		String x;
		x="hh";
		
		ec.setNom(x);
		ec.setNombreSalles(35);
		Fournisseur fr1=new Fournisseur();
		fr1.setNom("ALLANI");
		ec.setFournisseurs(new ArrayList<Fournisseur>());
		ec.getFournisseurs().add(fr1);
		session.save(ec);
		session.flush();
		tx.commit();
	}

}
