/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ricardo.proyecto.dao;

import com.mysql.jdbc.StringUtils;
import com.ricardo.proyecto.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author ricardotoledo
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Usuario u) {

        em.persist(u);
    }

    @Override
    public void edit(Usuario u) {
        em.merge(u);
    }

    @Override
    public void delete(Usuario u) {
        em.remove(em.merge(u));
    }

    @Override
    public List<Usuario> list() {
        String sql = "select u from Usuario u";
        Query query = em.createQuery(sql);
        List<Usuario> list = query.getResultList();
        return list;
    }

    @Override
    public Usuario find(Usuario u) {
        String sql = "select u from Usuario u WHERE u.id =" + u.getId();
        Query query = em.createQuery(sql);
        Usuario user = (Usuario) query.getSingleResult();
        return user;
    }

    public List<Usuario> paginate(int min , int max){
        List list=em.createQuery("select u from Usuario u")
                .setFirstResult(min)
                .setMaxResults(max)
                .getResultList();
        return list;
    }
    
    public int cantRows(){
        String sql = "SELECT COUNT(u) FROM Usuario u";
        Query query = em.createQuery(sql);
        Integer size=(Integer) query.getSingleResult().hashCode();
        return size;
    }
    
    public int cantPages(){
        return this.cantRows()/10;
    }
}
