package com.ap.ap.service;

import com.ap.ap.models.Usuario;
import com.ap.ap.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepo;





    public List<Usuario> buscarUsuario(){
        return usuarioRepo.findAll();

    }
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public  void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }




}