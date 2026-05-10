package rva_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.repository.DijagnozaRepository;

@Service
public class DijagnozaService {

    @Autowired
    private DijagnozaRepository dijagnozaRepository;

    public DijagnozaRepository getDijagnozaRepository() {
        return dijagnozaRepository;
    }
}