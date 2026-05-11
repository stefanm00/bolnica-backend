package rva_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @PostMapping("/pacijent")
    public Pacijent addPacijent(@RequestBody Pacijent pacijent) {
        return pacijentService.getPacijentRepository().save(pacijent);
    }
    @DeleteMapping("/pacijent/{id}")
    public void deletePacijent(@PathVariable Integer id) {
        pacijentService.getPacijentRepository().deleteById(id);
    }
}