package com.esgi4al.pa.models;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Citation {
	
	public int id;
	

	public Book book;
	public String citation;
	

	public List<Tag> tags;
	/*
	public Citation(String citation, int book_id) {
		this.citation = citation;
	}*/
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public String getCitation() {
		return citation;
	}


	public void setCitation(String citation) {
		this.citation = citation;
	}


	public List<Tag> getTags() {
		return tags;
	}


	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}


	
	
}