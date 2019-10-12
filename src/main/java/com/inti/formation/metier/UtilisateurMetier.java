package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Utilisateur;
import com.inti.formation.imetier.IUtilisateurMetier;
import com.inti.formation.repositories.IUtilisateurRepository;

@Service
public class UtilisateurMetier implements IUtilisateurMetier {
	
	@Autowired
	private IUtilisateurRepository repo;
	
	@Override
	public Utilisateur ajouter(Utilisateur a) {
		return repo.save(a);
	}

	@Override
	public Utilisateur update(Utilisateur a) {
		return repo.save(a);
	}

	@Override
	public Utilisateur getById(int id) {
		return repo.getOne(id);
	}

	@Override
	public List<Utilisateur> findAll() {
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

}
