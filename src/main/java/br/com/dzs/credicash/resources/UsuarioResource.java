package br.com.dzs.credicash.resources;

import br.com.dzs.credicash.dao.UsuariosDao;
import br.com.dzs.credicash.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 05/06/2020 - 20:21
 */

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuariosDao usuariosDao;

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> listar() {
        return usuariosDao.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void salvar(@RequestBody Usuario usuario) {
        usuariosDao.save(usuario);
    }
}
