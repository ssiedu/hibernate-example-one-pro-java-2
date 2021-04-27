package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpUpdate {

	public static void main(String[] args) {
		//Configuration config=new Configuration().configure();
		//SessionFactory sf=config.buildSessionFactory();
		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Emp emp=new Emp(); 
		emp.setEno(115); emp.setEname("EEE"); emp.setSal(90000); emp.setDesg("PM");
		session.update(emp);
		tr.commit();
		session.close();
		System.out.println("Record Modified....!!");
	}

}
