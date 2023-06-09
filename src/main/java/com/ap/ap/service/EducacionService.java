package com.ap.ap.service;

import com.ap.ap.models.Educacion;
import com.ap.ap.repository.EducacionRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    @Autowired
    private EducacionRepo educacionRepo;

    public Educacion addEducacion(Educacion educacion){
        return  educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEducaciones(){
        return educacionRepo.findAll();

    }
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public  void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
}