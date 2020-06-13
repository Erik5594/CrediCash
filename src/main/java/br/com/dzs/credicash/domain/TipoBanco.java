package br.com.dzs.credicash.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 10:14
 */
public enum TipoBanco {

    POUPANCA("Poupança"),
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_PAGAMENTO("Conta Pagamento");

    @Getter @Setter
    private String descricao;

    TipoBanco(String descricao) {
        this.descricao = descricao;
    }

}
