package br.com.dzs.credicash.domain;

import lombok.Data;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 06/06/2020 - 12:58
 */
public @Data class DetalhesErro {

    private String titulo;
    private Long status;
    private Long timestamp;
    private String mensagemDesenvolvedor;

    public DetalhesErro(String titulo, Long status, Long timestamp, String mensagemDesenvolvedor) {
        this.titulo = titulo;
        this.status = status;
        this.timestamp = timestamp;
        this.mensagemDesenvolvedor = mensagemDesenvolvedor;
    }
}
