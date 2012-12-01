package org.isima.hibernate.tests;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.isima.hibernate.persistance.Actionnaire;
import com.isima.hibernate.persistance.Ecole;
import com.isima.hibernate.util.HibernateUtil;

public class EcoleListingFromFournisseurTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.currentSession();
		Transaction tx=session.beginTransaction();
		Ecole e1;
		e1=(Ecole)session.load(Ecole.class,1 );
		 Actionnaire act1=(Actionnaire)session.load(Actionnaire.class,1 );
		for (Ecole e:act1.getEcoles()){
			Logger.getRootLogger().warn(e.getNom());
		    Logger.getRootLogger().warn("____________________");
		}	
			
		tx.commit();

	}

}
