package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable {
	private String title;
	private String author;
	private String catgory;
	private int price;
	
	public Book() {
		
	}

	public Book(String title, String author, String catgory, int price) {
		super();
		this.title = title;
		this.author = author;
		this.catgory = catgory;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCatgory() {
		return catgory;
	}

	public void setCatgory(String catgory) {
		this.catgory = catgory;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", catgory=" + catgory + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, catgory, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(catgory, other.catgory) && price == other.price
				&& Objects.equals(title, other.title);
	}
	
	public int compareTo(Object o){
		
		return this.title.compareTo(((Book)o).title);
		
		
	}
	

}
