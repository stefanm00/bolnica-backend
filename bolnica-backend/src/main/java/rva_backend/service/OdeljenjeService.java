package rva_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rva_backend.repository.OdeljenjeRepository;

@Service
public class OdeljenjeService {

    @Autowired
    private OdeljenjeRepository odeljenjeRepository;

    public OdeljenjeRepository getOdeljenjeRepository() {
        return odeljenjeRepository;
    }
}