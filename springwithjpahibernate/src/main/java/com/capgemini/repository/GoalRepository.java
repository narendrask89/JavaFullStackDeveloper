package com.capgemini.repository;

import java.util.List;

import com.capgemini.model.Goal;

public interface GoalRepository {

	Goal save(Goal goal);

	List<Goal> loadGoals();
}
