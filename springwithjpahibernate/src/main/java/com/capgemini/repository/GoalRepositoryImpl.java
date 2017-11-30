package com.capgemini.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Goal> loadGoals(){
		Query query = entityManager.createQuery("select g from Goal g");
		List<Goal> goals = query.getResultList();
		
		return goals;
	}

}
