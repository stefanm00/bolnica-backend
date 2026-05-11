package rva_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rva_backend.models.Pacijent;

public interface PacijentRepository extends JpaRepository<Pacijent, Integer> {
	List<Pacijent> findByImeContainingIgnoreCase(String ime);
	List<Pacijent> findByPrezimeContainingIgnoreCase(String prezime);

}