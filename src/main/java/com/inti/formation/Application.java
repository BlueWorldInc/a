package com.inti.formation;

import java.util.ArrayList;
import java.util.List;

import com.inti.formation.entities.Affaire;
import com.inti.formation.entities.Document;
import com.inti.formation.entities.Tache;
import com.inti.formation.imetier.IAffaireMetier;
import com.inti.formation.imetier.IDocumentMetier;
import com.inti.formation.metier.AffaireMetier;
import com.inti.formation.metier.DocumentMetier;

public class Application {
	
	public static void main(String[] args) {
		
		IAffaireMetier ametier = new AffaireMetier();
		IDocumentMetier dmetier = new DocumentMetier();
		List<Tache> taches = new ArrayList<>();
		List<Document> documents = new ArrayList<>();
		System.out.println("je suis là0");
		Document d0 = new Document();
		System.out.println(ametier.findAll());
		dmetier.ajouter(d0);
		System.out.println("je suis là1");
		Affaire a0 = new Affaire(10, "kerviel10", "kerviel10", "kerviel10", 10, taches, documents);
		ametier.ajouter(a0);
		System.out.println("je suis là2");
		System.out.println("ici la terre github me recoit il ?");
		System.out.println("ici la terre github me recoit il ?");
		System.out.println("ici la terre github me recoit il ?");
		
	}

}
