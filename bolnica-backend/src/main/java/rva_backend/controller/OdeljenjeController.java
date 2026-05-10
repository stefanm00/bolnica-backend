package rva_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}