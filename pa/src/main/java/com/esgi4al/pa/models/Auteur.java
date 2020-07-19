package com.esgi4al.pa.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Auteur {
	//public int id;
	public String nom;
	public String prenom;
	public String dateNaissance;

	public List<Book> books;
	
	/*
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Auteur(String nom, String prenom, String dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.books = new ArrayList<>();
	}
	
	public Auteur() {
	}
	
}
