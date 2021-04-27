package com.ssi;

import org.hibernate.Session;

public class QBIExample {

	public static void main(String[] args) {
		
		Session session=Util.getSF().openSession();
		Emp emp=session.get(Emp.class, 113);
		//System.out.println(emp);
		
		System.out.println("_______________________________________________");
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getDesg());
		System.out.println("_______________________________________________");
		
		session.close();

	}

}
