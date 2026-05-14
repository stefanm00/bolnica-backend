package rva_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.models.Dijagnoza;
import rva_backend.repository.DijagnozaRepository;

@Service
public class DijagnozaService {

    @Autowired
    private DijagnozaRepository repository;

    public List<Dijagnoza> getAll() {
        return repository.findAll();
    }

    public List<Dijagnoza> findByNaziv(String naziv) {
        return repository.findByNazivContainingIgnoreCase(naziv);
    }

    public List<Dijagnoza> findByOznaka(String oznaka) {
        return repository.findByOznakaContainingIgnoreCase(oznaka);
    }

    public Dijagnoza save(Dijagnoza dijagnoza) {
        return repository.save(dijagnoza);
    }

    public Optional<Dijagnoza> findById(Integer id) {
        return repository.findById(id);
    }

    public boolean existsById(Integer id) {
        return repository.existsById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}