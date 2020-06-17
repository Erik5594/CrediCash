package br.com.dzs.credicash.config.security;

import br.com.dzs.credicash.domain.Usuario;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 15/06/2020 - 21:54
 */
public class UsuarioSistema extends User {

    private static final long serialVersionUID = 1L;

    private Usuario usuario;


    public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
        super(StringUtils.isNotBlank(usuario.getUsername()) ? usuario.getUsername() : usuario.getEmail(),
                usuario.getSenha(), authorities);
        this.usuario = usuario;
    }
}
