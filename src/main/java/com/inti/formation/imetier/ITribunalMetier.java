package com.inti.formation.imetier;

import java.util.List;

import com.inti.formation.entities.Tribunal;

public interface ITribunalMetier {
	
	public Tribunal ajouter(Tribunal j);
	public Tribunal update(Tribunal j);
	public Tribunal getById(int id);
	public List<Tribunal> findAll();
	public void delete(int id);

}
