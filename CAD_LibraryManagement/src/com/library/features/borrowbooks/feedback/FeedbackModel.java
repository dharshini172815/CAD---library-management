package com.library.features.borrowbooks.feedback;

public class FeedbackModel {
	private final FeedbackView view;
	
	public FeedbackModel(FeedbackView feedbackview) {
		view = feedbackview;
	}
	
	void init() {
		System.out.println("Feedback model - " +view);
	}
}
