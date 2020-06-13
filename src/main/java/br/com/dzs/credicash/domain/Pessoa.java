package br.com.dzs.credicash.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 06/06/2020 - 19:37
 */

@Entity
public @Data class Pessoa{

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nome;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nomeMae;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cpfCgc;

    @OneToOne()
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Usuario usuario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @OneToMany(mappedBy = "pessoa")
    private List<Telefone> telefones;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> enderecos;

}
