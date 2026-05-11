package rva_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rva_backend.models.Bolnica;

public interface BolnicaRepository extends JpaRepository<Bolnica, Integer> {

    List<Bolnica> findByNazivContainingIgnoreCase(String naziv);

}