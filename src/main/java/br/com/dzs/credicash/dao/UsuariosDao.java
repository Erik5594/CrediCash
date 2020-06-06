package br.com.dzs.credicash.dao;

import br.com.dzs.credicash.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 06/06/2020 - 10:04
 */
public interface UsuariosDao extends JpaRepository<Usuario, Long>{
}
