package rva_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rva_backend.models.Odeljenje;

public interface OdeljenjeRepository extends JpaRepository<Odeljenje, Integer> {
	List<Odeljenje> findByNazivContainingIgnoreCase(String naziv);
	List<Odeljenje> findByLokacijaContainingIgnoreCase(String lokacija);
}