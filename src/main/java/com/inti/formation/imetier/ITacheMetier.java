package com.inti.formation.imetier;

import java.util.List;

import com.inti.formation.entities.Tache;

public interface ITacheMetier {

	public Tache ajouter(Tache j);
	public Tache update(Tache j);
	public Tache getById(int id);
	public List<Tache> findAll();
	public void delete(int id);
	
}
