package rva_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}