package br.com.dzs.credicash.resources;

import br.com.dzs.credicash.domain.Usuario;
import br.com.dzs.credicash.services.UsuariosService;
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
 * Data Criacao: 05/06/2020 - 20:21
 */

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuariosService usuariosService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(usuariosService.listar());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity salvar(@RequestBody Usuario usuario) {
        usuario = usuariosService.salvar(usuario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(usuario.getId()).toUri();

        return  ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity buscar(@PathVariable("id") Long id) {
        Usuario usuario = usuariosService.buscar(id);
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
        usuariosService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> atualizar(@RequestBody Usuario usuario, @PathVariable("id") Long id){
        usuario.setId(id);
        usuariosService.atualizar(usuario);
        return ResponseEntity.noContent().build();
    }
}
