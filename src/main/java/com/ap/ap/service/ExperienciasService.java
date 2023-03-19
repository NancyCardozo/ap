package com.ap.ap.service;

import com.ap.ap.models.Experiencias;
import com.ap.ap.repository.ExperienciasRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ExperienciasService {
    @Autowired
    private ExperienciasRepo experienciasRepo;

    public Experiencias addExperiencias(Experiencias experiencias){
        return experienciasRepo.save(experiencias);
    }
    public List<Experiencias> buscarExperiencias(){
        return experienciasRepo.findAll();
    }
    public Experiencias editarExperiencias(Experiencias experiencias){
        return experienciasRepo.save(experiencias);
    }
    public void borrarExperiencias(Long id){
        experienciasRepo.deleteById(id);
    }
}
