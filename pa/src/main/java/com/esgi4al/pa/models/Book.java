package com.esgi4al.pa.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Book {

	//public int id;
	public String titre;
	
	public Auteur auteur;
	public int anneeParution;

	public List<Citation> citations;
	
	public Book(String nom, int auteur_id, int anneeParution) {
		this.titre = nom;
		this.anneeParution = anneeParution;
		this.citations = new ArrayList<>();
	}
	
	public Book() {
		
	}
/*
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public int getAnneeParution() {
		return anneeParution;
	}

	public void setAnneeParution(int anneeParution) {
		this.anneeParution = anneeParution;
	}

	public List<Citation> getCitations() {
		return citations;
	}

	public void setCitations(List<Citation> citations) {
		this.citations = citations;
	}
	
}