package br.com.dzs.credicash.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 05/06/2020 - 20:35
 */
public @Data class Usuario {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cpfCnpj;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String senha;
}
