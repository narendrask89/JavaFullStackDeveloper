package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Goal;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();
}
