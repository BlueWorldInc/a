package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Phase;
import com.inti.formation.imetier.IPhaseMetier;
import com.inti.formation.repositories.IPhaseRepository;

@Service
public class PhaseMetier implements IPhaseMetier {

	@Autowired
	private IPhaseRepository repo;
	
	@Override
	public Phase ajouter(Phase a) {
		return repo.save(a);
	}

	@Override
	public Phase update(Phase a) {
		return repo.save(a);
	}

	@Override
	public Phase getById(int id) {
		return repo.getOne(id);
	}

	@Override
	public List<Phase> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}
	
}
