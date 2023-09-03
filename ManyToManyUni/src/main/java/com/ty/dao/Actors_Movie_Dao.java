package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Actors;
import com.ty.dto.Movies;


public class Actors_Movie_Dao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();


	public void saveActors(Movies movies ) {
	transaction.begin();
	manager.persist(movies);
	transaction.commit();
	}
	
	public void deleteActors(int id) {
		Actors actors = manager.find(Actors.class, id);
		if (actors  != null) {
			List<Movies> movies = manager.createQuery("from Movie").getResultList();
			for (Movies movies1 : movies) {
				if (movies1.getActor().contains(actors)) {
					movies1.getActor().remove(actors);
				}
			}
			transaction.begin();
			manager.remove(actors);
			transaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	
public void findAllActors(Actors actors) {
		
		Query query = manager.createQuery("select a from Actors a");
		List<Actors> list=query.getResultList();
		System.out.println(list);
	}
	
	public void findAllMovie(Movies movies) {
		
		Query query=manager.createQuery("select a from Movies a");
		List<Movies> list = query.getResultList();
		System.out.println(list);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
