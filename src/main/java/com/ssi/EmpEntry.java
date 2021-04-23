package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		
			//here we are going to insert a record in emp table

		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		//to insert a record, we need to create object of entity class.
		//Emp e=new Emp(111,"AAA",25000,"SE");
		//Emp e=new Emp(112,"BBB",30000,"SSE");
		Emp e=new Emp(113,"CCC",40000,"SE","QA");
		//set the properties using setter methods.
		//e.setEno(111); e.setEname("AAA"); e.setSal(25000);e.setDesg("SE");
		
		//to save the object call save method on session object
		
		session.save(e);		//internally insert command will be generated
		
		tr.commit();
		session.close();
		
		System.out.println("RECORD ADDED SUCCESFULLY");
		
	}

}
