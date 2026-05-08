package rva_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.models.Dobavljac;
import rva_backend.repository.DobavljacRepository;

@Service
public class DobavljacService {
	
	@Autowired
	private DobavljacRepository repo;
	
	public List<Dobavljac> getAll(){
		return repo.findAll();
	}
	
	public Optional<Dobavljac> findById(Integer id) {
		return repo.findById(id);
	}
	
	public List<Dobavljac> findByAdresaContainingIgnoreCase(String naziv) {
        return repo.findByAdresaContainingIgnoreCase(naziv);
    }
	
	public Dobavljac save(Dobavljac dobavljac) {
		return repo.save(dobavljac);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}
}