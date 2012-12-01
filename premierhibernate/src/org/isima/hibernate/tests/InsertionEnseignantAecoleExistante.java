package org.isima.hibernate.tests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.isima.hibernate.persistance.Ecole;
import com.isima.hibernate.persistance.Enseignant;
import com.isima.hibernate.util.HibernateUtil;

public class InsertionEnseignantAecoleExistante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.currentSession();

		Transaction tx=session.beginTransaction();
		
		Ecole e=(Ecole) session.load(Ecole.class, 1);
		Enseignant ens1=new Enseignant();
		ens1.setNcin("00987");
		ens1.setNom("Foulen1");
		
		Enseignant ens2=new Enseignant();
		ens2.setNcin("005678");
		ens2.setNom("Foulen2");
		
		e.getEnseignants().add(ens1);
		e.getEnseignants().add(ens2);
		
		session.saveOrUpdate(e);
		tx.commit();

	}

}
