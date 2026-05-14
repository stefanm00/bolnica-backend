package rva_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.models.Bolnica;
import rva_backend.repository.BolnicaRepository;

@Service
public class BolnicaService {

    @Autowired
    private BolnicaRepository repository;

    public List<Bolnica> getAll() {
        return repository.findAll();
    }

    public List<Bolnica> findByNaziv(String naziv) {
        return repository.findByNazivContainingIgnoreCase(naziv);
    }

    public Bolnica save(Bolnica bolnica) {
        return repository.save(bolnica);
    }

    public Optional<Bolnica> findById(Integer id) {
        return repository.findById(id);
    }

    public boolean existsById(Integer id) {
        return repository.existsById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}