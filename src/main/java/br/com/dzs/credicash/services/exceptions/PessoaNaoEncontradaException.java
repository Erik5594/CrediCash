package br.com.dzs.credicash.services.exceptions;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 06/06/2020 - 12:24
 */
public class PessoaNaoEncontradaException extends RuntimeException {

    public PessoaNaoEncontradaException(String mensagem){
        super(mensagem);
    }

    public PessoaNaoEncontradaException(String mensagem, Throwable causa){
        super(mensagem, causa);

    }

}
