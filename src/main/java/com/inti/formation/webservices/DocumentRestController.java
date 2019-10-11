package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Document;
import com.inti.formation.imetier.IDocumentMetier;


@RestController
@RequestMapping("/apiDocument")
@CrossOrigin("*")
public class DocumentRestController {
	
	@Autowired
	private IDocumentMetier metier;
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Document ajouter(@RequestBody Document j) {
		return metier.ajouter(j);
	};
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Document update(@RequestBody Document j) {
		return metier.update(j);
	};
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Document getById(@PathVariable int id) {
		return metier.getById(id);
	};
	
	@RequestMapping(value = "/Documents", method = RequestMethod.GET)
	public List<Document> findAll(){
		return metier.findAll();
	};
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		metier.delete(id);
	};
	

}
