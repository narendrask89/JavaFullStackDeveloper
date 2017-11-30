package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.model.Goal;
import com.capgemini.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;

	@Override
	@Transactional
	public Goal save(Goal goal) {
		return this.goalRepository.save(goal);
	}

	@Override
	public List<Goal> findAllGoals(){
		return this.goalRepository.loadGoals();
	}
}
