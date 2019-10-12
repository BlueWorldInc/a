package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Affaire;
import com.inti.formation.imetier.IAffaireMetier;
import com.inti.formation.repositories.IAffaireRepository;

@Service
public class AffaireMetier implements IAffaireMetier {

	@Autowired
	private IAffaireRepository repo;
	
	@Override
	public Affaire ajouter(Affaire a) {
		return repo.save(a);
	}

	@Override
	public Affaire update(Affaire a) {
		return repo.save(a);
	}

	@Override
	public Affaire getById(int id) {
		return repo.getOne(id);
	}

	@Override
	public List<Affaire> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

}
