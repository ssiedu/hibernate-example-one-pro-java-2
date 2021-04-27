package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpDelete {

	public static void main(String[] args) {
		
		Session session=Util.getSF().openSession();
		Emp emp=new Emp(); emp.setEno(115);
		Transaction tr=session.beginTransaction();
		session.delete(emp);	//delete from emp where ecode=?
		tr.commit();
		session.close();
		System.out.println("Record Removed...!!");
		

	}

}
