package com.ap.ap.service;

import com.ap.ap.models.Proyectos;
import com.ap.ap.repository.ProyectosRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProyectosService {
    @Autowired
    private ProyectosRepo projectRepo;


    public Proyectos addProject(Proyectos proyectos){
        return projectRepo.save(proyectos);
    }
    public Proyectos updateProject(Proyectos project){
        return projectRepo.save(project);
    }
    public List<Proyectos> findAllProjects(){
        return projectRepo.findAll();
    }
    public void deleteProject(Long id){
        projectRepo.deleteById(id);
    }
}
