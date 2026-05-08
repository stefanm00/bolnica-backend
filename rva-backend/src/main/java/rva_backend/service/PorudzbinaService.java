package rva_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.models.Porudzbina;
import rva_backend.repository.PorudzbinaRepository;

@Service
public class PorudzbinaService {
	
	@Autowired
	private PorudzbinaRepository repo;
	
	public List<Porudzbina> getAll(){
		return repo.findAll();
	}
	
	public Optional<Porudzbina> findById(Integer id) {
		return repo.findById(id);
	}
	
	public List<Porudzbina> findByPlacenoTrue() {
        return repo.findByPlacenoTrue();
    }
	
	public Porudzbina save(Porudzbina porudzbina) {
		return repo.save(porudzbina);
	}
	
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

}