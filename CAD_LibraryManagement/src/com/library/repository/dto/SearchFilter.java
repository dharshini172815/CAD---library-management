package com.library.repository.dto;

public class SearchFilter {
	 private String keyword;
	    private String authorFilter;
	    private String genreFilter;
	    private int yearFilter;
		public String getKeyword() {
			return keyword;
		}
		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}
		public String getAuthorFilter() {
			return authorFilter;
		}
		public void setAuthorFilter(String authorFilter) {
			this.authorFilter = authorFilter;
		}
		public String getGenreFilter() {
			return genreFilter;
		}
		public void setGenreFilter(String genreFilter) {
			this.genreFilter = genreFilter;
		}
		public int getYearFilter() {
			return yearFilter;
		}
		public void setYearFilter(int yearFilter) {
			this.yearFilter = yearFilter;
		}
}
