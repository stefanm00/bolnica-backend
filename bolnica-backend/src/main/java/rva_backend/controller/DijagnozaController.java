package rva_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}