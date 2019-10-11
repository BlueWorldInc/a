package com.inti.formation.imetier;

import java.util.List;

import com.inti.formation.entities.Affaire;

public interface IAffaireMetier {
	
	public Affaire ajouter(Affaire j);
	public Affaire update(Affaire j);
	public Affaire getById(int id);
	public List<Affaire> findAll();
	public void delete(int id);

}
