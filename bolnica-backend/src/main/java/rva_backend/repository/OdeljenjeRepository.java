package rva_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rva_backend.models.Odeljenje;

public interface OdeljenjeRepository extends JpaRepository<Odeljenje, Integer> {
}