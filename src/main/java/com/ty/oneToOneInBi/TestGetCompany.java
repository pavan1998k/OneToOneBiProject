package com.ty.oneToOneInBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Company company=entityManager.find(Company.class, 1);
		if(company != null) {
			System.out.println("Name: "+company.getName());
			System.out.println("Phone no: "+company.getPhone());
			System.out.println("Web: "+company.getWeb());
			System.out.println("---------------------------");
			
			Gst gst=company.getGst();
			System.out.println("Gst No: "+gst.getGstNo());
			System.out.println("State: "+gst.getState());
			System.out.println("Country: "+gst.getCountry());
			System.out.println("******************************");
		}
		else {
			System.out.println("Invalid Company id");
		}
	}
}
