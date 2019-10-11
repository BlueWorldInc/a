package com.inti.formation.imetier;

import java.util.List;

import com.inti.formation.entities.Phase;

public interface IPhaseMetier {

	public Phase ajouter(Phase j);
	public Phase update(Phase j);
	public Phase getById(int id);
	public List<Phase> findAll();
	public void delete(int id);
	
}
