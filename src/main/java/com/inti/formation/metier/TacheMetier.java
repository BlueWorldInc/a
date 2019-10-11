package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Tache;
import com.inti.formation.imetier.ITacheMetier;
import com.inti.formation.repositories.ITacheRepository;

@Service
public class TacheMetier implements ITacheMetier {

	@Autowired
	private ITacheRepository repo;
	
	@Override
	public Tache ajouter(Tache a) {
		return repo.save(a);
	}

	@Override
	public Tache update(Tache a) {
		return repo.save(a);
	}

	@Override
	public Tache getById(int id) {
		return repo.getOne(id);
	}

	@Override
	public List<Tache> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}
}
