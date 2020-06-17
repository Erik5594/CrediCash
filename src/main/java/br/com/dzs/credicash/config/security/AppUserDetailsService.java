package br.com.dzs.credicash.config.security;

import br.com.dzs.credicash.domain.Role;
import br.com.dzs.credicash.domain.Usuario;
import br.com.dzs.credicash.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.*;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 15/06/2020 - 21:51
 */
public class AppUserDetailsService implements UserDetailsService{
    @Autowired
    private UsuariosService usuariosService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuariosService.buscarByEmailOrUsuario(username);
        if(usuario != null){
            return new UsuarioSistema(usuario, getGrupos(usuario));
        }else{
            throw new UsernameNotFoundException("Usuário não encontrado!");
        }
    }

    private Collection<? extends GrantedAuthority> getGrupos(Usuario usuario) {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for(Role role : usuario.getRoles()){
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getNome().toUpperCase()));
        }

        return authorities;
    }
}
