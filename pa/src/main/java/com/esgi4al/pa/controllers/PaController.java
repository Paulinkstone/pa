package com.esgi4al.pa.controllers;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esgi4al.pa.models.Citation;
import com.esgi4al.pa.service.FirebaseInit;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

@RestController
public class PaController {
	
	@Autowired
	FirebaseInit db;
	

	@GetMapping("/getAllCitations")
	public List<Citation> getAllCitations() throws InterruptedException, ExecutionException {
		List<Citation> citaList = new ArrayList<Citation>();
		CollectionReference citation = db.getFibase().collection("Citation");
		ApiFuture<QuerySnapshot> querySnapshot = citation.get();
		
		for(DocumentSnapshot doc:querySnapshot.get().getDocuments()) {
			Citation cita = doc.toObject(Citation.class);
			citaList.add(cita);
		}
		return citaList;
	}
	
	
	@PostMapping("/saveCitation")
	public int saveCitation(@RequestBody Citation citation) {
		CollectionReference citationCR = db.getFibase().collection("Citation");
		citationCR.document(String.valueOf(citation.getId())).set(citation);
		return citation.getId();
	}
	
	/*@PostMapping("/saveCitation")
	public boolean addCitation(@RequestBody Citation citation) {
		boolean data = db.addCitation(citation);
		return data;
	}*/
}
