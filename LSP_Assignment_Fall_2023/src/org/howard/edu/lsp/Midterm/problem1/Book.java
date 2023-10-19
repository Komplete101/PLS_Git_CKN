package org.howard.edu.lsp.Midterm.problem1;

public class Book {
	private String title;
	private String author;
	private	int year;
			public Book(String title, String author, int year) {
				this.title = title;
				this.author = author;
				this.year = year;
			}
			public String toString() {
				return "Title: " + title + " Author: " + author + " Year: " + year;
			}
			public boolean equals(Object o) {
				if (o == this) {
					return true;
				}
				if (!(o instanceof Book)) {
					return false;
				}
				Book b = (Book) o;
				return title.equals(b.title) && author.equals(b.author) && year == b.year;
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
