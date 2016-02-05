
package com.ricardo.proyecto.dao;

import com.ricardo.proyecto.model.Usuario;
import java.util.List;

/**
 *
 * @author ricardotoledo
 */
public interface UsuarioDAO {
    public void save(Usuario u);
    public void edit(Usuario u);
    public void delete(Usuario u);
    public List<Usuario> list();
    public Usuario find(Usuario u);
}
