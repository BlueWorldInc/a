package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.Tache;

public interface ITacheRepository extends JpaRepository<Tache, Integer> {

}
