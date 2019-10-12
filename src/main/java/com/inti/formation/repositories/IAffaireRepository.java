package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.Affaire;

public interface IAffaireRepository extends JpaRepository<Affaire, Integer> {

}
