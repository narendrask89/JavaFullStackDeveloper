package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Activity;
import com.capgemini.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);
}