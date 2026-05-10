package rva_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.repository.PacijentRepository;

@Service
public class PacijentService {

    @Autowired
    private PacijentRepository pacijentRepository;

    public PacijentRepository getPacijentRepository() {
        return pacijentRepository;
    }
}