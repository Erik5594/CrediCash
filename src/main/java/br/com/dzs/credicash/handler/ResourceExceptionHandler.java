package br.com.dzs.credicash.handler;

import br.com.dzs.credicash.domain.DetalhesErro;
import br.com.dzs.credicash.services.exceptions.PessoaNaoEncontradaException;
import br.com.dzs.credicash.services.exceptions.UsuarioNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 06/06/2020 - 12:39
 */
@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public ResponseEntity<DetalhesErro> handleUsuarioNaoEncontradoException
                        (UsuarioNaoEncontradoException e, HttpServletRequest request){
        DetalhesErro detalhesErro = new DetalhesErro("O usuário não pode ser encontrado.",
                404l,
                System.currentTimeMillis(),
                "Acesse: http://erros.credicash.com/404 para obter mais informações.");

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(detalhesErro);
    }

    @ExceptionHandler(PessoaNaoEncontradaException.class)
    public ResponseEntity<DetalhesErro> handlePessoaNaoEncontradaException
            (PessoaNaoEncontradaException e, HttpServletRequest request){
        DetalhesErro detalhesErro = new DetalhesErro("A pessoa não pode ser encontrada.",
                404l,
                System.currentTimeMillis(),
                "Acesse: http://erros.credicash.com/404 para obter mais informações.");

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(detalhesErro);
    }
}
