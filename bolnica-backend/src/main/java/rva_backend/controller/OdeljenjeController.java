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

import rva_backend.models.Odeljenje;
import rva_backend.service.OdeljenjeService;

@RestController
public class OdeljenjeController {

    @Autowired
    private OdeljenjeService odeljenjeService;

    @GetMapping("/odeljenje")
    public List<Odeljenje> getAll() {
        return odeljenjeService.getOdeljenjeRepository().findAll();
    }
    @GetMapping("/odeljenjeByNaziv/{naziv}")
    public List<Odeljenje> getByNaziv(@PathVariable String naziv) {
        return odeljenjeService.getOdeljenjeRepository().findByNazivContainingIgnoreCase(naziv);
    }

    @GetMapping("/odeljenjeByLokacija/{lokacija}")
    public List<Odeljenje> getByLokacija(@PathVariable String lokacija) {
        return odeljenjeService.getOdeljenjeRepository().findByLokacijaContainingIgnoreCase(lokacija);
    }

    @PostMapping("/odeljenje")
    public Odeljenje addOdeljenje(@RequestBody Odeljenje odeljenje) {
        return odeljenjeService.getOdeljenjeRepository().save(odeljenje);
    }
    @DeleteMapping("/odeljenje/{id}")
    public void deleteOdeljenje(@PathVariable Integer id) {
        odeljenjeService.getOdeljenjeRepository().deleteById(id);
    }
    @PutMapping("/odeljenje")
    public Odeljenje updateOdeljenje(@RequestBody Odeljenje odeljenje) {
        return odeljenjeService.getOdeljenjeRepository().save(odeljenje);
    }
}