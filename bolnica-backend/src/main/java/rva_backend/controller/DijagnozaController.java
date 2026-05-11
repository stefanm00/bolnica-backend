package rva_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import rva_backend.models.Dijagnoza;
import rva_backend.service.DijagnozaService;

@RestController
public class DijagnozaController {

    @Autowired
    private DijagnozaService dijagnozaService;

    @GetMapping("/dijagnoza")
    public List<Dijagnoza> getAll() {
        return dijagnozaService.getDijagnozaRepository().findAll();
    }
    @GetMapping("/dijagnozaByNaziv/{naziv}")
    public List<Dijagnoza> getByNaziv(@PathVariable String naziv) {
        return dijagnozaService.getDijagnozaRepository().findByNazivContainingIgnoreCase(naziv);
    }

    @GetMapping("/dijagnozaByOznaka/{oznaka}")
    public List<Dijagnoza> getByOznaka(@PathVariable String oznaka) {
        return dijagnozaService.getDijagnozaRepository().findByOznakaContainingIgnoreCase(oznaka);
    }

    @PostMapping("/dijagnoza")
    public Dijagnoza addDijagnoza(@RequestBody Dijagnoza dijagnoza) {
        return dijagnozaService.getDijagnozaRepository().save(dijagnoza);
    }
    @DeleteMapping("/dijagnoza/{id}")
    public void deleteDijagnoza(@PathVariable Integer id) {
        dijagnozaService.getDijagnozaRepository().deleteById(id);
    }
    @PutMapping("/dijagnoza")
    public Dijagnoza updateDijagnoza(@RequestBody Dijagnoza dijagnoza) {
        return dijagnozaService.getDijagnozaRepository().save(dijagnoza);
    }
}