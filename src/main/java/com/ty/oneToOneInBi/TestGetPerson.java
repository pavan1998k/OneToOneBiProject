package com.ty.oneToOneInBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class, 1);
		if(person != null) {
			System.out.println("Name: "+person.getName());
			System.out.println("Email: "+person.getEmail());
			System.out.println("PHone no: "+person.getPhone());
			System.out.println("*********************************");
			
			Pan pan=person.getPan();
			System.out.println("Pan No: "+pan.getPanNumber());
			System.out.println("Pan Address: "+pan.getAddress());
			System.out.println("--------------------------------------------");
		}
	}
}
