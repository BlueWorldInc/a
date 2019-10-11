package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Tribunal;
import com.inti.formation.imetier.ITribunalMetier;
import com.inti.formation.repositories.ITribunalRepository;

@Service
public class TribunalMetier implements ITribunalMetier {

	@Autowired
	private ITribunalRepository repo;
	
	@Override
	public Tribunal ajouter(Tribunal a) {
		return repo.save(a);
	}

	@Override
	public Tribunal update(Tribunal a) {
		return repo.save(a);
	}

	@Override
	public Tribunal getById(int id) {
		return repo.getOne(id);
	}

	@Override
	public List<Tribunal> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}
	
}
