package rva_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rva_backend.models.Bolnica;

public interface BolnicaRepository extends JpaRepository<Bolnica, Integer> {
}