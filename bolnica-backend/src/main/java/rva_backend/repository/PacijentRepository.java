package rva_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rva_backend.models.Pacijent;

public interface PacijentRepository extends JpaRepository<Pacijent, Integer> {

}