package com.esgi4al.pa.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.esgi4al.pa.models.Citation;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class FirebaseInit {
	private Firestore db;
	
	public FirebaseInit() throws Exception {
		initDB();
	}
	
	/*
	public boolean addCitation(Citation citation) {
		String stdId = UUID.randomUUID().toString();
		CollectionReference collRef = db.collection("Citation");
		Map<String, Citation> data = new HashMap<>();
		data.put(stdId, citation);
		collRef.add(data);
		return true;
	}*/
	

	@PostConstruct
	private void initDB() throws IOException{
		
		InputStream serviceAccount = this.getClass().getClassLoader().getResourceAsStream("./projetannuel4jal-firebase-adminsdk-50jqu-c25e9a7f88.json");

				FirebaseOptions options = new FirebaseOptions.Builder()
				  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
				  .setDatabaseUrl("https://projetannuel4jal.firebaseio.com")
				  .build();
		if(FirebaseApp.getApps().isEmpty()) {
			FirebaseApp.initializeApp(options);
		}
				
	}
	
	public Firestore getFibase() {
		return FirestoreClient.getFirestore();
	}
}
