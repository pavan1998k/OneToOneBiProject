package com.ty.oneToOneInBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetVehicle {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 3);
		if(vehicle != null) {
			System.out.println("Name: "+vehicle.getName());
			System.out.println("Cost: "+vehicle.getCost());
			System.out.println("-----------------------------------");
			
			Charcy charcy=vehicle.getCharcy();
			System.out.println("Charsi No: "+charcy.getCharcyNumber());
			System.out.println("Charsi Type: "+charcy.getType());
			System.out.println("************************************");
		}
		else {
			System.out.println("No Vehicle found");
		}
	}
}
