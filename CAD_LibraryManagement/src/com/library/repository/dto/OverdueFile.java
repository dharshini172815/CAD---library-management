package com.library.repository.dto;

public class OverdueFile {
	 private Borrow borrow;
	    private int daysOverdue;
	    private double fineAmount;
	    private String fileCreatedDate;
	    private boolean isCleared;
		public Borrow getBorrow() {
			return borrow;
		}
		public void setBorrow(Borrow borrow) {
			this.borrow = borrow;
		}
		public int getDaysOverdue() {
			return daysOverdue;
		}
		public void setDaysOverdue(int daysOverdue) {
			this.daysOverdue = daysOverdue;
		}
		public double getFineAmount() {
			return fineAmount;
		}
		public void setFineAmount(double fineAmount) {
			this.fineAmount = fineAmount;
		}
		public String getFileCreatedDate() {
			return fileCreatedDate;
		}
		public void setFileCreatedDate(String fileCreatedDate) {
			this.fileCreatedDate = fileCreatedDate;
		}
		public boolean isCleared() {
			return isCleared;
		}
		public void setCleared(boolean isCleared) {
			this.isCleared = isCleared;
		}
}
