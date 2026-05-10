package rva_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import rva_backend.models.Pacijent;
import rva_backend.service.PacijentService;

@RestController
public class PacijentController {

    @Autowired
    private PacijentService pacijentService;

    @GetMapping("/pacijent")
    public List<Pacijent> getAll() {
        return pacijentService.getPacijentRepository().findAll();
    }
}