package br.com.dzs.credicash.resources;

import br.com.dzs.credicash.domain.Pessoa;
import br.com.dzs.credicash.services.PessoasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 13/06/2020 - 18:03
 */

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
    private PessoasService pessoasService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Pessoa>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(pessoasService.listar());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity salvar(@RequestBody Pessoa pessoa) {
        pessoa = pessoasService.salvar(pessoa);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(pessoa.getId()).toUri();

        return  ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity buscar(@PathVariable("id") Long id) {
        Pessoa pessoa = pessoasService.buscar(id);
        return ResponseEntity.status(HttpStatus.OK).body(pessoa);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> atualizar(@RequestBody Pessoa pessoa, @PathVariable("id") Long id){
        pessoa.setId(id);
        pessoasService.atualizar(pessoa);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
        pessoasService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
