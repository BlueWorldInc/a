package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Tache;
import com.inti.formation.imetier.ITacheMetier;

@RestController
@RequestMapping("/apiTache")
@CrossOrigin("*")
public class TacheRestController {

	@Autowired
	private ITacheMetier metier;
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Tache ajouter(@RequestBody Tache j) {
		return metier.ajouter(j);
	};
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Tache update(@RequestBody Tache j) {
		return metier.update(j);
	};
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Tache getById(@PathVariable int id) {
		return metier.getById(id);
	};
	
	@RequestMapping(value = "/Taches", method = RequestMethod.GET)
	public List<Tache> findAll(){
		return metier.findAll();
	};
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		metier.delete(id);
	};
	
}
