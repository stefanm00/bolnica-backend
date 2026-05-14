package rva_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.models.Pacijent;
import rva_backend.repository.PacijentRepository;

@Service
public class PacijentService {

    @Autowired
    private PacijentRepository repository;

    public List<Pacijent> getAll() {
        return repository.findAll();
    }

    public List<Pacijent> findByIme(String ime) {
        return repository.findByImeContainingIgnoreCase(ime);
    }

    public List<Pacijent> findByPrezime(String prezime) {
        return repository.findByPrezimeContainingIgnoreCase(prezime);
    }

    public Pacijent save(Pacijent pacijent) {
        return repository.save(pacijent);
    }

    public Optional<Pacijent> findById(Integer id) {
        return repository.findById(id);
    }

    public boolean existsById(Integer id) {
        return repository.existsById(id);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}