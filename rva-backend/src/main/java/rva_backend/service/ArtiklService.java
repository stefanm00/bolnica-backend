package rva_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.models.Artikl;
import rva_backend.repository.ArtiklRepository;

@Service
public class ArtiklService {
	
	@Autowired
	private ArtiklRepository repo;
	
	public List<Artikl> getAll() {
		return repo.findAll();
	}
	
	public Optional<Artikl> findById(Integer id) {
		return repo.findById(id);
	}
	
	public List<Artikl> getArtiklsByNaziv(String naziv) {
		return repo.findByNazivContainingIgnoreCase(naziv);
	}
	
	public Artikl save(Artikl artikl) {
		return repo.save(artikl);
	}
	
	public boolean existById(Integer id) {
		return repo.existsById(id);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}
}
