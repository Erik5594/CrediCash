package br.com.dzs.credicash.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 05/06/2020 - 20:35
 */
@Entity
public @Data class Usuario {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String usuario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String senha;
}
