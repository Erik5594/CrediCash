package br.com.dzs.credicash.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 10:10
 */
public enum ImagemStatus {

    EM_ANALISE("Em analise"),
    APROVADA("Aprovada"),
    REPROVADA("Reprovada");

    @Getter @Setter
    private String descricao;

    ImagemStatus(String descricao) {
        this.descricao = descricao;
    }
}
