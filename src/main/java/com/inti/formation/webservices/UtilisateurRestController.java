package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Utilisateur;
import com.inti.formation.imetier.IUtilisateurMetier;

@RestController
@RequestMapping("/apiUtilisateur")
@CrossOrigin("*")
public class UtilisateurRestController {

	@Autowired
	private IUtilisateurMetier metier;
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Utilisateur ajouter(@RequestBody Utilisateur j) {
		return metier.ajouter(j);
	};
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Utilisateur update(@RequestBody Utilisateur j) {
		return metier.update(j);
	};
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Utilisateur getById(@PathVariable int id) {
		return metier.getById(id);
	};
	
	@RequestMapping(value = "/Utilisateurs", method = RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return metier.findAll();
	};
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		metier.delete(id);
	};
	
}
