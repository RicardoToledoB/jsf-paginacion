/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ricardo.proyecto.service;

import com.ricardo.proyecto.dao.UsuarioDAOImpl;
import com.ricardo.proyecto.model.Usuario;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author ricardotoledo
 */
public class UsuarioServiceImpl implements UsuarioService{
    @Inject
    private UsuarioDAOImpl uDAO;
    @Override
    public void save(Usuario u) {
        uDAO.save(u);
    }

    @Override
    public void edit(Usuario u) {
        uDAO.edit(u);
    }

    @Override
    public void delete(Usuario u) {
        uDAO.delete(u);
    }

    @Override
    public List<Usuario> list() {
        return uDAO.list();
    }

    @Override
    public Usuario find(Usuario u) {
        return uDAO.find(u);
    }
}
