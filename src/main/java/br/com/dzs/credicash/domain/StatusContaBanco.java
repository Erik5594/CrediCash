package br.com.dzs.credicash.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 10:16
 */
public enum StatusContaBanco {

    NAO_VERIFICADA("Não verificada"),
    VERIFICADA("Verificada");

    @Getter @Setter
    private String descricao;

    StatusContaBanco(String descricao) {
        this.descricao = descricao;
    }

}
