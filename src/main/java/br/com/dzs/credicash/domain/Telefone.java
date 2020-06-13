package br.com.dzs.credicash.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 10:05
 */

@Entity
public @Data class Telefone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ddd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String numero;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TipoTelefone tipoTelefone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id")
    @JsonIgnore
    private Pessoa pessoa;

}
