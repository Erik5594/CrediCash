package br.com.dzs.credicash.services;

import br.com.dzs.credicash.dao.UsuariosDao;
import br.com.dzs.credicash.domain.Usuario;
import br.com.dzs.credicash.services.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 06/06/2020 - 12:21
 */

@Service
public class UsuariosService {

    private static final String USUARIO_NAO_ENCONTRADO = "Usuário não encontrado.";

    @Autowired
    private UsuariosDao usuariosDao;

    public List<Usuario> listar(){
        return usuariosDao.findAll();
    }

    public Usuario buscar(Long id){
        Usuario usuario = usuariosDao.findOne(id);
        if(usuario == null){
            throw new UsuarioNaoEncontradoException(USUARIO_NAO_ENCONTRADO);
        }
        return usuario;
    }

    public Usuario salvar(Usuario usuario){
        usuario.setId(null);
        return usuariosDao.save(usuario);
    }

    public void deletar(Long id){
        try{
            usuariosDao.delete(id);
        } catch (EmptyResultDataAccessException e){
            throw new UsuarioNaoEncontradoException(USUARIO_NAO_ENCONTRADO);
        }
    }

    public void atualizar(Usuario usuario){
        verificarExistencia(usuario);
        usuariosDao.save(usuario);
    }

    private void verificarExistencia(Usuario usuario){
        buscar(usuario.getId());
    }
}
