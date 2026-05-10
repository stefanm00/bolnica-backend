package rva_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.repository.BolnicaRepository;

@Service
public class BolnicaService {

    @Autowired
    private BolnicaRepository bolnicaRepository;

    public BolnicaRepository getBolnicaRepository() {
        return bolnicaRepository;
    }
}