package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Tribunal;
import com.inti.formation.imetier.ITribunalMetier;

@RestController
@RequestMapping("/apiTribunal")
@CrossOrigin("*")
public class TribunalRestController {

	@Autowired
	private ITribunalMetier metier;
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Tribunal ajouter(@RequestBody Tribunal j) {
		return metier.ajouter(j);
	};
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Tribunal update(@RequestBody Tribunal j) {
		return metier.update(j);
	};
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Tribunal getById(@PathVariable int id) {
		return metier.getById(id);
	};
	
	@RequestMapping(value = "/Tribunals", method = RequestMethod.GET)
	public List<Tribunal> findAll(){
		return metier.findAll();
	};
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		metier.delete(id);
	};
	
}
