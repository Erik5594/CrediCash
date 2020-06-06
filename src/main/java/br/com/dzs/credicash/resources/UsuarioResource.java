package br.com.dzs.credicash.resources;

import br.com.dzs.credicash.domain.Usuario;
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
public class UsuarioResource {

    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    public List<Usuario> listar() {
        Usuario usuario1 = new Usuario();
        usuario1.setId(1l);
        usuario1.setCpfCnpj("03554424188");
        usuario1.setEmail("erik.derick74@gmail.com");
        usuario1.setNome("Erik Queiroz");
        usuario1.setSenha(null);

        Usuario usuario2 = new Usuario();
        usuario2.setId(2l);
        usuario2.setCpfCnpj("10040170011");
        usuario2.setEmail("laiz@gmail.com");
        usuario2.setNome("Laiz Queiroz");
        usuario2.setSenha(null);

        Usuario[] usuarios = {usuario1, usuario2};
        return Arrays.asList(usuarios);
    }
}
