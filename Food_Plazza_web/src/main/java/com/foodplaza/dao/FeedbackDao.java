package com.foodplaza.dao;

import java.util.List;

import com.foodplaza.pojo.Feedback;

public interface FeedbackDao {
	boolean addfeedback(Feedback feedback);
	List<Feedback>getAllFeedback();
}
