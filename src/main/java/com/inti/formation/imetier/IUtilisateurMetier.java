package com.inti.formation.imetier;

import java.util.List;

import com.inti.formation.entities.Utilisateur;

public interface IUtilisateurMetier {

	public Utilisateur ajouter(Utilisateur j);
	public Utilisateur update(Utilisateur j);
	public Utilisateur getById(int id);
	public List<Utilisateur> findAll();
	public void delete(int id);
	
}
