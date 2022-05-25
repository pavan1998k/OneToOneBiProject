package com.ty.oneToOneInBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Pan pan=entityManager.find(Pan.class, 1);
		if(pan != null) {
			System.out.println("Pan No: "+pan.getPanNumber());
			System.out.println("Pan Address: "+pan.getAddress());
			System.out.println("--------------------------------------------");

			Person person=pan.getPerson();
			
			System.out.println("Name: "+person.getName());
			System.out.println("Email: "+person.getEmail());
			System.out.println("PHone no: "+person.getPhone());
			System.out.println("*********************************");
		}
	}
}
