package br.com.dzs.credicash.services.exceptions;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 06/06/2020 - 12:24
 */
public class UsuarioNaoEncontradoException extends RuntimeException {

    public UsuarioNaoEncontradoException(String mensagem){
        super(mensagem);
    }

    public UsuarioNaoEncontradoException(String mensagem, Throwable causa){
        super(mensagem, causa);

    }

}
