package br.com.dzs.credicash.dao;

import br.com.dzs.credicash.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 17:15
 */
public interface PessoasDao extends JpaRepository<Pessoa, Long> {
}
