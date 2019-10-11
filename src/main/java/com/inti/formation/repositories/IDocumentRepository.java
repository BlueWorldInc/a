package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.Document;

public interface IDocumentRepository extends JpaRepository<Document, Integer> {

}
