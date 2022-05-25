package com.ty.oneToOneInBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Company company=new Company();
		company.setName("Test Yantra");
		company.setPhone(7411920739l);
		company.setWeb("www.TestYantra.com");

		Gst gst=new Gst();
		gst.setGstNo("abcd12345");
		gst.setState("Karnataka");
		gst.setCountry("India");
		
		gst.setCompany(company);
		company.setGst(gst);

		entityTransaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);
		entityTransaction.commit();
	}
}
