package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Affaire;
import com.inti.formation.imetier.IAffaireMetier;

@RestController
@RequestMapping("/apiAffaire")
@CrossOrigin("*")
public class AffaireRestController {
	
	@Autowired
	private IAffaireMetier metier;
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Affaire ajouter(@RequestBody Affaire j) {
		return metier.ajouter(j);
	};
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Affaire update(@RequestBody Affaire j) {
		return metier.update(j);
	};
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Affaire getById(@PathVariable int id) {
		return metier.getById(id);
	};
	
	@RequestMapping(value = "/Affaires", method = RequestMethod.GET)
	public List<Affaire> findAll(){
		return metier.findAll();
	};
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		metier.delete(id);
	};
	

}
