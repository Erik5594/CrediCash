package br.com.dzs.credicash.services;

import br.com.dzs.credicash.dao.PessoasDao;
import br.com.dzs.credicash.domain.Pessoa;
import br.com.dzs.credicash.services.exceptions.PessoaNaoEncontradaException;
import br.com.dzs.credicash.services.exceptions.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 17:20
 */

@Service
public class PessoasService {

    private static final String PESSOA_NAO_ENCONTRADA = "Pessoa não encontrada.";

    @Autowired
    private PessoasDao pessoasDao;

    public List<Pessoa> listar(){
        return pessoasDao.findAll();
    }

    public Pessoa salvar(Pessoa pessoa){
        pessoa.setId(null);
        return pessoasDao.save(pessoa);
    }

    public Pessoa buscar(Long id){
        Pessoa pessoa = pessoasDao.findOne(id);
        if(pessoa == null){
            throw new PessoaNaoEncontradaException(PESSOA_NAO_ENCONTRADA);
        }
        return pessoa;
    }

    public void atualizar(Pessoa pessoa){
        verificarExistencia(pessoa);
        pessoasDao.save(pessoa);
    }

    private void verificarExistencia(Pessoa pessoa){
        buscar(pessoa.getId());
    }


    public void deletar(Long id){
        try{
            pessoasDao.delete(id);
        } catch (EmptyResultDataAccessException e){
            throw new UsuarioNaoEncontradoException(PESSOA_NAO_ENCONTRADA);
        }
    }

}
