package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
