package com.inti.formation.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class Tache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int idTache;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private String titre;
	private String description;
	private boolean statutAudience;
	@ManyToMany (mappedBy = "taches",fetch = FetchType.LAZY)
	private List<Utilisateur> utilisateurs;
	@ManyToOne
	@JoinColumn(name = "idTribunal")
	private Tribunal tribunal;	
	@ManyToOne
	@JoinColumn(name = "idAffaire")
	private Affaire affaire;
	@OneToMany(mappedBy = "tache",fetch = FetchType.EAGER)
	private List<Phase> phases;
	
	
}
