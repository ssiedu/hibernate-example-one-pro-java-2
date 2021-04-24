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
		Emp e1=new Emp(111,"AAA",25000,"SE");
		Emp e2=new Emp(112,"BBB",45000,"SE");
		Emp e3=new Emp(113,"CCC",50000,"SSE");
		Emp e4=new Emp(114,"DDD",70000,"SSE");
		Emp e5=new Emp(115,"EEE",85000,"TL");
		session.save(e1); session.save(e2); session.save(e3);
		session.save(e4); session.save(e5);
		tr.commit();
		session.close();
		
		System.out.println("RECORD ADDED SUCCESFULLY");
		
	}

}
