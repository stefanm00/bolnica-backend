package rva_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.models.Odeljenje;
import rva_backend.repository.OdeljenjeRepository;

@Service
public class OdeljenjeService {

    @Autowired
    private OdeljenjeRepository repository;

    public List<Odeljenje> getAll() {
        return repository.findAll();
    }

    public List<Odeljenje> findByNaziv(String naziv) {
        return repository.findByNazivContainingIgnoreCase(naziv);
    }

    public List<Odeljenje> findByLokacija(String lokacija) {
        return repository.findByLokacijaContainingIgnoreCase(lokacija);
    }

    public Odeljenje save(Odeljenje odeljenje) {
        return repository.save(odeljenje);
    }

    public Optional<Odeljenje> findById(Integer id) {
        return repository.findById(id);
    }

    public boolean existsById(Integer id) {
        return repository.existsById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}