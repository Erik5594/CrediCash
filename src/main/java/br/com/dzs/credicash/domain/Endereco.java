package br.com.dzs.credicash.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 16:35
 */
@Entity
public @Data class Endereco {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String logradouro;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String complemento;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String bairro;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cidade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String uf;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id")
    @JsonIgnore
    private Pessoa pessoa;
}
