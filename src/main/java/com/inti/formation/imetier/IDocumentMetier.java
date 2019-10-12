package com.inti.formation.imetier;

import java.util.List;

import com.inti.formation.entities.Document;

public interface IDocumentMetier {

	public Document ajouter(Document j);
	public Document update(Document j);
	public Document getById(int id);
	public List<Document> findAll();
	public void delete(int id);
	
}
