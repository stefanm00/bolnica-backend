package rva_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import rva_backend.models.Bolnica;
import rva_backend.service.BolnicaService;

@RestController
public class BolnicaController {

    @Autowired
    private BolnicaService bolnicaService;

    @GetMapping("/bolnica")
    public List<Bolnica> getAll() {
        return bolnicaService.getBolnicaRepository().findAll();
    }

    @PostMapping("/bolnica")
    public Bolnica addBolnica(@RequestBody Bolnica bolnica) {
        return bolnicaService.getBolnicaRepository().save(bolnica);
    }
        @DeleteMapping("/bolnica/{id}")
        public void deleteBolnica(@PathVariable Integer id) {
            bolnicaService.getBolnicaRepository().deleteById(id);
        
    }
}