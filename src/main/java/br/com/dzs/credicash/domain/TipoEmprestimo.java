package br.com.dzs.credicash.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 10:09
 */
public enum TipoEmprestimo {

    CARTAO("Cartão");

    @Getter @Setter
    private String descricao;

    TipoEmprestimo(String descricao) {
        this.descricao = descricao;
    }
}
