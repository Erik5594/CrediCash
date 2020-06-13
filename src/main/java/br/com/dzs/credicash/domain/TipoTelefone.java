package br.com.dzs.credicash.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 10:06
 */

public enum TipoTelefone {

    REDIDENCIAL("Residencial"),
    COMERCIAL("Comercial"),
    CELULAR("Celular");

    @Getter @Setter
    private String descricao;

    TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

}
