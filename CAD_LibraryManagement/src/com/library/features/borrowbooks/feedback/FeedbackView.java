package com.library.features.borrowbooks.feedback;

public class FeedbackView {
	private final FeedbackModel model;
	
	public FeedbackView() {
		model = new FeedbackModel(this);
	}
	
	public void init() {
		model.init();
		System.out.println("Feedback view - " +model);
	}
}
