package com.capgemini.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public Goal save(Goal goal) {
		
		entityManager.persist(goal);
		
		return goal;
	}

}
