package com.cs.ganesh.Hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cs.ganesh.dto.Address;
import com.cs.ganesh.dto.UserDetails;
import com.cs.ganesh.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
	
		/*Address addr =new Address();
		addr.setStreet("Street name");
		addr.setCity("City name");
		addr.setState("state name");
		addr.setPincode("pincede");*/
		
		
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");
		
		Vehicle vehicle2 = new Vehicle();
		vehicle.setVehicleName("Jepp");
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		vehicle.getUserList().add(user);
		vehicle2.getUserList().add(user);
		 
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("User name reterived :"+user.getUserName());
		session.close();
	}

}
