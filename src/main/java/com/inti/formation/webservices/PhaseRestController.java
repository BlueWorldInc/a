package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Phase;
import com.inti.formation.imetier.IPhaseMetier;

@RestController
@RequestMapping("/apiPhase")
@CrossOrigin("*")
public class PhaseRestController {

	@Autowired
	private IPhaseMetier metier;
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Phase ajouter(@RequestBody Phase j) {
		return metier.ajouter(j);
	};
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Phase update(@RequestBody Phase j) {
		return metier.update(j);
	};
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Phase getById(@PathVariable int id) {
		return metier.getById(id);
	};
	
	@RequestMapping(value = "/Phases", method = RequestMethod.GET)
	public List<Phase> findAll(){
		return metier.findAll();
	};
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		metier.delete(id);
	};
	
}
