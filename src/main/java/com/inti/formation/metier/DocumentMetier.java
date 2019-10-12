package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Document;
import com.inti.formation.imetier.IDocumentMetier;
import com.inti.formation.repositories.IDocumentRepository;

@Service
public class DocumentMetier implements IDocumentMetier {

	@Autowired
	private IDocumentRepository repo;
	
	@Override
	public Document ajouter(Document a) {
		return repo.save(a);
	}

	@Override
	public Document update(Document a) {
		return repo.save(a);
	}

	@Override
	public Document getById(int id) {
		return repo.getOne(id);
	}

	@Override
	public List<Document> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}
	
}
